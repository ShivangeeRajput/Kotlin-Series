package com.example

import kotlinx.coroutines.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// Retrofit API Interface
interface RetrofitApiCalls {
    @GET("apiEndpoint1")
    suspend fun apiCall1(): String // 5 secs

    @GET("apiEndpoint2")
    suspend fun apiCall2(): Int // 3 secs
}


val retrofit = Retrofit.Builder()
    .baseUrl("https://changejar.in/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val apiService = retrofit.create(RetrofitApiCalls::class.java)

suspend fun fetchApiResults(): Pair<String, Int> {
    return coroutineScope {
        val apiCall1Result = async { apiService.apiCall1() }
        val apiCall2Result = async { apiService.apiCall2() }


        Pair(apiCall1Result.await(), apiCall2Result.await())
    }
}

fun main() = runBlocking {

    val finalResult = fetchApiResults()
    println("Final Result: $finalResult")
}
