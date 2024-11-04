package com.example.coroutineExample

import kotlinx.coroutines.*

fun main() {
    // Running a coroutine on the Main (UI) thread
    GlobalScope.launch(Dispatchers.Main) {
        println("Running on Main: ${Thread.currentThread().name}")
    }

    // Running a coroutine on the IO thread for network or database operations
    GlobalScope.launch(Dispatchers.IO) {
        println("Running on IO: ${Thread.currentThread().name}")
        // Simulate a long-running I/O task
        delay(1000)
        println("I/O task completed")
    }

    // Running a coroutine on the Default thread for CPU-intensive tasks
    GlobalScope.launch(Dispatchers.Default) {
        println("Running on Default: ${Thread.currentThread().name}")
        // Simulate a CPU-intensive task
        for (i in 1..5) {
            println("Computing... $i")
            delay(500)
        }
        println("Computation completed")
    }

    // Running a coroutine on the current thread without blocking it
    GlobalScope.launch(Dispatchers.Unconfined) {
        println("Running on Unconfined: ${Thread.currentThread().name}")
        delay(500)
        println("Still on Unconfined: ${Thread.currentThread().name}")
    }

    // Keep the main thread alive for a while to see the coroutine results
    Thread.sleep(3000)
}
