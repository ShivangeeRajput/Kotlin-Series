package com.example.chainedApiCalls

data class UserProfile(
    val name: String,
    val email: String,
    val password: String
)
data class Post(
    val id:String,
    val title:String,
    val body:String
)