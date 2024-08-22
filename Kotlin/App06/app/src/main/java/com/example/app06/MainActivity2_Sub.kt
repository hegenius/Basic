package com.example.app06

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app06.databinding.Activity2SubBinding

class MainActivity2_Sub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity2_sub)
        val binding = Activity2SubBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        추가 버튼 클릭
        binding.btnInsert.setOnClickListener {
            intent.putExtra("name", binding.edtname.text.toString())
            intent.putExtra("phone", binding.edtphone.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}