package com.example.program

import com.example.apiService
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope


// Coroutine scope to make calls concurrently
suspend fun fetchApiResults(): Pair<String,Int> {
    return coroutineScope {
        val apiCall1Result = async { apiService.apiCall1() }
        val apiCall2Result = async { apiService.apiCall2() }

        // Await both results and pair them
        Pair(apiCall1Result.await(), apiCall2Result.await())
    }
}



//suspend fun fetchApiResults():Pair<String,String>{
//    return coroutineScope {
//
//    }
//}
