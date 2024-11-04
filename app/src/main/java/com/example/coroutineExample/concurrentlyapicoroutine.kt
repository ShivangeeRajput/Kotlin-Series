package com.example.coroutineExample

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class ApiImpl : ApiInterface {
     suspend fun api1() = listOf("Ritesh", "Rajat", "Rohan")
     suspend fun api2() = listOf("Himanshu", "Harman", "Harpreet")
     suspend fun api3() = listOf("Alice", "Akash", "Aman")
     suspend fun api4() = listOf("Devansh", "Diksha", "Dhruv")
     suspend fun api5() = listOf("Sunny", "Salman", "Saurav")
}

fun main() = runBlocking {
    // Initialize the ApiInterface instance
    val apiService = ApiImpl()

    // Mutable list to keep track of UI data in order
    val uiList = mutableListOf<String>()

    // Launch coroutines to fetch the API responses concurrently
    val apiCalls = coroutineScope {
        listOf(
            async { apiService.api3() to 3 },
            async { apiService.api1() to 1 },
            async { apiService.api5() to 5 },
            async { apiService.api2() to 2 },
            async { apiService.api4() to 4 }
        )
    }

    // Process each API response as they complete
    apiCalls.forEach { deferred ->
        val (response, order) = deferred.await()
        when (order) {
            1 -> uiList.addAll(0, response) // Insert at the beginning
            2 -> uiList.addAll(3, response) // After the first three names (api1)
            3 -> uiList.addAll(response)     // First response, just add it
            4 -> uiList.addAll(9, response)  // After nine items (api1 + api2 + api3)
            5 -> uiList.addAll(6, response)  // After six items (api1 + api3)
        }

        // Print the UI list after each API response for demonstration
        println("| UI List |")
        uiList.forEach { println("| $it |") }
        println()
    }
}
