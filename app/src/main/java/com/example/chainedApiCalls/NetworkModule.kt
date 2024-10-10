package com.example.chainedApiCalls

import com.example.retrofit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class NetworkModule {

    fun providesRetrofit():Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("BASE_URL")
            .build()

    }
    val apiService= retrofit.create(ApiService::class.java)
}