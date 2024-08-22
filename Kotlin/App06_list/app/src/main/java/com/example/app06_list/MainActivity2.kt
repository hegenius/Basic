package com.example.app06_list

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app06_list.databinding.ActivityMain2Binding

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

//        1. 데이터 연결
        val friendList2 = mutableListOf<Friend>()
//        2. 어댑터 생성
        val friendAdapter2 = FriendAdapter2(friendList2)
//        3. 리사이클러뷰와 어댑터 연결
        binding.recyclerView.adapter = friendAdapter2
//        4. 리사이클러뷰 레이아웃 설정
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

//        데이터 생성
        for(i in 0 .. 9) {
            friendList2.add(Friend("${i} 번 째 사람", "${i} 번 째 메세지", R.drawable.ic_launcher))
        }

        // 클릭 이벤트
        friendAdapter2.onItemClickListener = object:FriendAdapter2.OnItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(application, "onItemClickListener ${position}", Toast.LENGTH_SHORT).show()
            }
        }

//        롱클릭 이벤트
        friendAdapter2.onLongItemClickListener = object:FriendAdapter2.OnLongItemClickListener {
            override fun onLongItemClick(position: Int) {
                friendList2.removeAt(position)
                friendAdapter2.notifyDataSetChanged()
            }
        }
    }
}