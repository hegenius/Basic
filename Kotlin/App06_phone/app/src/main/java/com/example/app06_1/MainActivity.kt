package com.example.app06_1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app06_1.databinding.ActivityMainBinding

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
        val phoneList = mutableListOf<Phone> ()

//        2. 어댑터 생성
        val phoneAdapter = PhoneAdapter(phoneList)

//        3. 리싸이클러뷰와 어댑터 연결
        binding.recyclerView.adapter = phoneAdapter

//        4. 리싸이클러뷰 레이아웃 설정
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
            for (i in 0..4) {
                phoneList.add(Phone("Phone$i", "010-9999-888$i"))
            }

        var position:Int = 0
//        어댑터에 있는 리스너(인터페이스) 호출
        phoneAdapter.onItemClickListener = object:PhoneAdapter.OnItemClickListener{
            override fun onItemClick(pos: Int) {
                binding.editName.setText(phoneList[pos].name)
                binding.editTel.setText(phoneList[pos].tel)
                binding.btnUpdate.isEnabled = true
                binding.btnDelete.isEnabled = true
                Toast.makeText(application, "OnItemClickListener pos : $pos", Toast.LENGTH_SHORT).show()
            }
        }

//        추가버튼
        binding.btnInsert.setOnClickListener {
//            phoneList.add(Phone(binding.editName.text.toString(), binding.editTel.text.toString()))
//            phoneAdapter.notifyDataSetChanged()
            val phone = Phone(binding.editName.text.toString(), binding.editTel.text.toString())
            phoneAdapter.addItem(phone)
            binding.editName.setText("")
            binding.editTel.setText("")
        }

//         수정버튼
        binding.btnUpdate.setOnClickListener {
            val phonedto = Phone(
                binding.editName.text.toString(),
                binding.editTel.text.toString()
            )
            phoneAdapter.updateItem(phonedto, position)
            binding.editName.setText("")
            binding.editTel.setText("")
            binding.btnUpdate.isEnabled = false
            binding.btnDelete.isEnabled = false
        }

//        삭제
        binding.btnDelete.setOnClickListener {
            phoneAdapter.removeItem(position)
            binding.editName.setText("")
            binding.editTel.setText("")
            binding.btnUpdate.isEnabled = false
            binding.btnDelete.isEnabled = false
        }
    }
}