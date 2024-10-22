package com.example

fun main() {
    println("Enter a string:")
    val string= readLine()
    println(string?.reversed())

    if (string != null) {
        for (char in string){
            println(char)
        }

    }
}