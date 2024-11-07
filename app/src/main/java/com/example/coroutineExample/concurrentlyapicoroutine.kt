package com.example.coroutineExample

import kotlinx.coroutines.*
import java.net.InterfaceAddress
import kotlin.coroutines.CoroutineContext

interface ApiInterface{
    suspend fun api1()= listOf("Ryan","Jack","Sam")
    suspend fun api2()= listOf("Rhea","Ria","Rian")
    suspend fun api3()= listOf("Liam","Chris","Harry")
    suspend fun api4()= listOf("Vance","Samuel","Alex")
    suspend fun api5()= listOf("Alex","Alexander","Alexa")
}
class ApiImpl : ApiInterface

fun main() = runBlocking {
    // Initializing the ApiInterface instance
    val apiService = ApiImpl()

    // Mutable list for keep track of UI data in order
    val uiList = mutableListOf<String>()

    // Launching coroutines to fetch the API responses concurrently
    val apiCalls = coroutineScope {
        listOf(
            async{apiService.api3() to 3},
            async{apiService.api1() to 1},
            async{apiService.api5() to 5},
            async{apiService.api2() to 2},
            async {apiService.api4() to 4}
        )
    }

    // Processing each API response as they complete
    apiCalls.forEach { deferred ->
        val (response, order) = deferred.await()
        when (order) {
            1 -> uiList.addAll(0, response)
            2 -> uiList.addAll(3, response)
            3 -> uiList.addAll(response)
            4 -> uiList.addAll(9, response)
            5 -> uiList.addAll(6, response)
        }

        // Printing the UI list after each API response for demonstration
        println("| UI List |")
        uiList.forEach { println("| $it |") }
        println()
    }
}
