package com.example.app07

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.app07.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    val binding by lazy {ActivityMain2Binding.inflate(layoutInflater)} // inner class 에서 필요해서 상단으로 뺌

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main2)
//        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

// binding 공통이라서 with 사용해서 작성
//        val listener = ClickHandler()
//        binding.btnSong.setOnClickListener(listener)
//        binding.btnArtist.setOnClickListener(listener)
//        binding.btnAlbum.setOnClickListener(listener)

        with(binding) {
        val listener = ClickHandler()
            btnSong.setOnClickListener(listener)
            btnArtist.setOnClickListener(listener)
            btnAlbum.setOnClickListener(listener)
        }


        // 음악
        val songfragment = Fragment_song()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, songfragment)
        transaction.commit()
        
        // 음악별 버튼
//        binding.btnSong.setOnClickListener {
//            val songfragment = Fragment_song()
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.fragment_container, songfragment)
//            transaction.commit()
//
//        }
//      //가수별 버튼
//        binding.btnArtist.setOnClickListener {
//            val artistfragment = Fragment_artist()
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.fragment_container, artistfragment)
//            transaction.commit()
//
//        }
//      //앨범별 버튼
//        binding.btnAlbum.setOnClickListener {
//            val albumfragment = Fragment_album()
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.fragment_container, albumfragment)
//            transaction.commit()
//        }
        
    } // onCreate

    inner class ClickHandler(): View.OnClickListener {

        var fr: Fragment?= null
        override fun onClick(v: View?) {
            when(v!!.id) {
                binding.btnSong.id -> fr = Fragment_song()
                binding.btnArtist.id -> fr = Fragment_artist()
                binding.btnAlbum.id -> fr = Fragment_album()
            }
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fr!!)
                .addToBackStack(null)
                .commit()
        }
    }

}