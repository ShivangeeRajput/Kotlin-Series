package com.example.coroutineExample

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking


fun main() {
//= runBlocking {
//    try {
//        val result = async(Dispatchers.Default) {
//            // Coroutine code that may throw an exception
//            throw RuntimeException("Error occurred")
//        }.await()
//        println(result)
//    } catch (e: Exception) {
//        println("Caught exception: ${e.message}")
//    }


    val exceptionHandler= CoroutineExceptionHandler{
        coroutineContext, throwable ->
        println("Caught exception: ${throwable.message}")
    }
}