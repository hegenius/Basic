package com.example.app06_retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// 싱글톤 형태로 사용
object PhotoClient {
    val retrofit:PhotoInterface = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PhotoInterface::class.java)
}