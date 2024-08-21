package com.example

import androidx.annotation.MainThread
import androidx.lifecycle.LifecycleCoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun main() {

    GlobalScope.launch(Dispatchers.Main){
    println("Running on main thread :${Thread.currentThread().name}")
}
    GlobalScope.launch(Dispatchers.IO){
        println("Running on IO thread: ${Thread.currentThread().name}")
    }
    GlobalScope.launch(Dispatchers.Unconfined){
        println("Running on unconfined thread: ${Thread.currentThread().name}")
    }
    GlobalScope.launch(Dispatchers.Default) {
        println("Running on default thread: ${Thread.currentThread().name}")
    }

    val result=GlobalScope.async {
        fetchData()
    }.await()

    val r = withContext(Dispatchers.IO) {
        fetchData()
    }

    val job=GlobalScope.launch {
        fetchData()
    }
    job.cancel()//cancel the coroutine



}

suspend fun fetchData():String{
    delay(3000)
    return "Data"
}
suspend fun suspendCoroutineExample()= suspendCoroutine<String> {
        continuation  -> continuation.resume("Result")
}
suspend fun suspendCancellableCoroutineExample()=suspendCancellableCoroutine<String>{
        continuation -> continuation.resume("Result")
}
//coroutine scope
 suspend fun fetchMultipleData()= coroutineScope {
     launch { fetchData() }
     launch { fetchData() }
 }
