package com.example

fun main() {
    println("What is your name:")
    val user_name: String? = readLine()
    val message = "Hello, ${user_name ?: "Stranger"}"
    println(message)
    //In the above line If first operand isn't null, then it will be returned.
    // If it is null, then the second operand will be returned.
}

