package com.example.app07_tab

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.app07_tab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with(binding) {
            val listener = ClickHandler()
            btnOne.setOnClickListener(listener)
            btnTwo.setOnClickListener(listener)
            btnThree.setOnClickListener(listener)
        }
    }

    inner class ClickHandler() : View.OnClickListener {
        var fr: Fragment?= null
        override fun onClick(v: View?) {
            when(v!!.id) {
                binding.btnOne.id -> fr = Fragment_one()
                binding.btnTwo.id -> fr = Fragment_two()
                binding.btnThree.id -> fr = Fragment_three()
            }

            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fr!!)
                .addToBackStack(null)
                .commit()
        }
    }
}