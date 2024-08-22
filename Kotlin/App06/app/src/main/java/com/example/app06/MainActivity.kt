package com.example.app06

import android.content.DialogInterface
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app06.databinding.ActivityMainBinding
import com.example.app06.databinding.DialogPersonBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        1. 데이터 생성
        val personList = mutableListOf<Person>()
        
//        2. 어댑터 생성
        val personAdapter = PersonAdapter(personList)

//        3. 리사이클러뷰와 어댑터 연결
        binding.recyclerView.adapter = personAdapter

//        4. 리사이클러뷰 레이아웃 설정
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        
//        전제보기 버튼 클릭
        binding.button.setOnClickListener {
            personList.clear()
            for(i in 0.. 6) {
                personList.add(Person("강감찬$i", "010-1111-333$i"))
        }
            personAdapter.notifyDataSetChanged()
        }

//         + 추가버튼
        binding.floatingActionButton.setOnClickListener{
            val dialogPerson = DialogPersonBinding.inflate(layoutInflater)
            AlertDialog.Builder(this).run {
                setTitle("추가")
                setMessage("추가내용 입력하세요")
                setView(dialogPerson.root)
                setPositiveButton("확인", object : DialogInterface.OnClickListener {
                    override fun onClick(p0: DialogInterface?, p1: Int) {
                        personList.add(Person(dialogPerson.edtname.text.toString(),
                                              dialogPerson.edtphone.text.toString()))
                        personAdapter.notifyDataSetChanged()
                    }
                })
                setNegativeButton("닫기", null)
                show()
            }
        }
    }
}























