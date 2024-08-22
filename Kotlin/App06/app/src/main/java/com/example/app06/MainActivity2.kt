package com.example.app06

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app06.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main2)
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        1. 데이터 생성
        var personList2 = mutableListOf<Person2>()

//        2. 어댑터 생성
        val adapter2 = PersonAdapter2(personList2)

//        3. 리사이클러뷰와 어댑터 연결
        binding.recyclerView.adapter = adapter2

//        4. 리사이클러뷰 레이아웃 설정
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

//        전제보기 버튼
        binding.btnAll.setOnClickListener {
            for(i in 0 .. 6) {
                personList2.add(Person2("이름$i", "010-0000-777$i"))
            }
            adapter2.notifyDataSetChanged()
        }

        ////// return 값 있을 경우 사용
        val activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if(it.resultCode == RESULT_OK) {
                val name = it.data?.getStringExtra("name").toString() ?:""
                val phone = it.data?.getStringExtra("phone") ?:""
                personList2.add(Person2(name, phone))
                adapter2.notifyDataSetChanged()
            }
        }

//        추가 버튼
    binding.btnAdd.setOnClickListener {
        val intent = Intent(this@MainActivity2, MainActivity2_Sub::class.java)
//      startActivity(intent) // 리턴값 없을 경우
            activityResultLauncher.launch(intent) //  리턴값 있을 경우

        }
    }
}
