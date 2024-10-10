package com.example.chainedApiCalls

data class UserProfile(
    val id: String,
    val name: String,
    val email: String
)

data class Post(
    val id:String,
    val title:String,
    val body:String
)