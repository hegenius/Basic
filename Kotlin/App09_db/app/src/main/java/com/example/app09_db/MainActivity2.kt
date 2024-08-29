package com.example.app09_db

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.icu.util.Calendar
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app09_db.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
  val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }
  lateinit var sqLiteDatabase:SQLiteDatabase
  lateinit var myDBHelper:MyDBHelper

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
//    setContentView(R.layout.activity_main2)
//    val binding = ActivityMain2Binding.inflate(layoutInflater)
    setContentView(binding.root)
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
      insets
    }
    myDBHelper = MyDBHelper(this)

    // DB 설정
    sqLiteDatabase = myDBHelper.writableDatabase

    // 오늘 날짜
    val calendar = Calendar.getInstance()
    val cYear = calendar.get(Calendar.YEAR)
    val cMonth = calendar.get(Calendar.MONTH) // 0 ~ 11
    val cDay = calendar.get(Calendar.DAY_OF_MONTH) // 2024-08-29
    var diaryDate = "${cYear}-${cMonth+1}-${cDay}" // 오늘날짜
    Log.d("sql diaryDate :", diaryDate)
    // 오늘날짜 읽기 보여주기
    binding.edtDiary.setText(readDiary(diaryDate)) // diaryDate : 오늘날짜
    binding.btnWrite.isEnabled = true

    // datePicker2 에서 날짜 선택할 때
    binding.datePicker2.init(cYear,cMonth,cDay) { datePicker, year, month, day ->
      // 선택된 날짜의 일기를 읽어오기
      diaryDate = "${year}-${month}-${day}" // datePicker2에서 선택된 날짜
      binding.edtDiary.setText(readDiary(diaryDate))

    }

    // 쓰기 버튼
    binding.btnWrite.setOnClickListener {
      sqLiteDatabase = myDBHelper.writableDatabase
      var sql = "insert into myDiary values('${diaryDate}','${binding.edtDiary.text}')"
      if (binding.btnWrite.text.equals("수정하기")){
        sql = "update myDiary set content = '${binding.edtDiary.text}'" +
          " where diaryDate = '${diaryDate}' "
      }
      Log.d("sql insert :", sql)
      sqLiteDatabase.execSQL(sql)
      sqLiteDatabase.close()
      Toast.makeText(this, "입력완료", Toast.LENGTH_SHORT).show()
    }
  } // onCreate

  private fun readDiary(diaryDate: String): String {
    var strResult = ""
    sqLiteDatabase = myDBHelper.readableDatabase  // 읽기모드
    val sql = "select * from myDiary where diaryDate = '$diaryDate'"
    Log.d("sql select :", sql)
    var cursor:Cursor = sqLiteDatabase.rawQuery(sql, null)
    if(cursor.moveToNext()) {
      strResult = cursor.getString(1)
      binding.btnWrite.text = "수정하기"
      Toast.makeText(this, "일기조회${strResult}", Toast.LENGTH_SHORT).show()
    } else {
      binding.btnWrite.text = "새로 저장"
      binding.edtDiary.setText("")
      binding.edtDiary.hint = "일기 없음"
    }

    return strResult
  }

  // 내부클래스 (중첩클래스)
  class MyDBHelper(context:Context):SQLiteOpenHelper(context, "myDB", null, 1) {
    override fun onCreate(sqLiteDatabase: SQLiteDatabase) {
      // 테이블 생성용
      sqLiteDatabase.execSQL("create table if not exists " +
                    "myDiary(diaryDate char(10), content varchar(500))")
    }

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, p1: Int, p2: Int) {
      sqLiteDatabase.execSQL("drop table if exists myDiary")
    }

  }
}

















