package com.example.app07

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var listFragment:ListFragment // 초기화 늦게 함

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
        
        // 프래그먼트(화면전환) p338 ==> 프래그먼트 매니저 메소드로 호출 : activity에 종속적
        setFragment()
        binding.btnSend.setOnClickListener {
            listFragment.setValue("전달할 값")
        }

    } // onCreate

    fun setFragment() {
        listFragment = ListFragment()
        var bundle = Bundle()
        bundle.putString("key1", "List Fragment")
        bundle.putInt("key2", 20240823)
        listFragment.arguments = bundle

        val transaction = supportFragmentManager.beginTransaction()
//        transaction.add(R.id.frameLayout, listFragment)
//        transaction.commit()
        transaction.run {
            add(R.id.frameLayout, listFragment)
            commit()
        }
    } // setFragment

    fun goDetail() {
        val detailFragment = DetailFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, detailFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    } // goDetail
    
    fun goBack() {
        onBackPressedDispatcher.onBackPressed() // 뒤로가기
    }
    
}




















