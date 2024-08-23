package com.example.app06_retrofit

import retrofit2.Call
import retrofit2.http.GET


interface PhotoInterface {
    // 리턴값 존재 함
    @GET("photos/")
    fun doGetPhotos(): Call<List<Photo>>

    @GET("posts/")
    fun doGetPosts(): Call<List<Post>>

    @GET("comments/")
    fun doGetComments(): Call<List<CommentVo>>
}