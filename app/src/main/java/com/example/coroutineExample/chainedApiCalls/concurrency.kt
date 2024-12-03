package com.example.coroutineExample.chainedApiCalls

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch { // Task 1
        repeat(5) {
            println("Task 1: $it")
            delay(500) // Simulating work
        }
    }

    launch { // Task 2
        repeat(5) {
            println("Task 2: $it")
            delay(300) // Simulating work
        }
    }
}