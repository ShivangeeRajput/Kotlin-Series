package com.example.chainedApiCalls

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("user/profile")
    suspend fun getUserProfile():UserProfile

    //chaining
    @GET("user/post")
    suspend fun getUserPost(@Path("userId") userId:String) : List<Post>

}