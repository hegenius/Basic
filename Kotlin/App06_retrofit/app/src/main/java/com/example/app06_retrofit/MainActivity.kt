package com.example.app06_retrofit

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app06_retrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response


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

//        layout
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

//        photo
        binding.btnPhoto.setOnClickListener {
            // 1. 데이터 mutableListOf 생성
            var photoList = mutableListOf<Photo>()
            // 2. 어댑터 생성
            val photoAdapter = PhotoAdapter(photoList)
            // 3. 어댑터 연결
            binding.recyclerView.adapter = photoAdapter
            PhotoClient.retrofit.doGetPhotos().enqueue(object:retrofit2.Callback<List<Photo>>{
                override fun onResponse(call: Call<List<Photo>>, response: Response<List<Photo>>) {
                    if (response.isSuccessful) {
                        Log.d("onResponse :", "${response.body()}")
                        for (photo in response.body()!!) {
                            photoList.add(photo)
                        } // for
                    photoAdapter.notifyDataSetChanged()
                    }
                } // 성공했을 때


                override fun onFailure(call: Call<List<Photo>>, t: Throwable) {
                    Log.d("onFailure :", t.localizedMessage)
                } // 실패했을 때

            }) // enqueue end

        } // photo end


//        post
        binding.btnPost.setOnClickListener {
            // 1. 데이터 mutableListOf 생성
            var postList = mutableListOf<Post>()
            // 2. 어댑터 생성
            val postAdapter = PostAdapter(postList)
            // 3. 어댑터 연결
            binding.recyclerView.adapter = postAdapter

            PhotoClient.retrofit.doGetPosts().enqueue(object:retrofit2.Callback<List<Post>> {
                override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                    if (response.isSuccessful) {
                        Log.d("onResponse :", "${response.body()}")
                        for (post in response.body()!!) {
                            postList.add(post)
                        } // for
                        postAdapter.notifyDataSetChanged()
                    }
                }

                override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                    Log.d("onFailure :", t.localizedMessage)
                }
            })
        }// post end


        //        comment
        binding.btnComment.setOnClickListener {
            // 1. 데이터 mutableListOf 생성
            var commentVoList = mutableListOf<CommentVo>()
            // 2. 어댑터 생성
            val commentAdapter = CommentAdapter(commentVoList)
            // 3. 어댑터 연결
            binding.recyclerView.adapter = commentAdapter

            // 콜백
            PhotoClient.retrofit.doGetComments().enqueue(object:retrofit2.Callback<List<CommentVo>> {
                override fun onResponse(call: Call<List<CommentVo>>, response: Response<List<CommentVo>>
                ) {
                    if (response.isSuccessful) {
                        Log.d("onResponse :", "${response.body()}")
                        for (comment in response.body()!!) {
                            commentVoList.add(comment)
                        } // for
                        commentAdapter.notifyDataSetChanged()
                    }
                }

                override fun onFailure(call: Call<List<CommentVo>>, t: Throwable) {
                    Log.d("onFailure :", t.localizedMessage)
                }

            })
        }// comment end


    }
}