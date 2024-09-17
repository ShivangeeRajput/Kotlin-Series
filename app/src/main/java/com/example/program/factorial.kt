package com.example.program
fun main() {
    val num=5
    println("Factorial of $num is ${factorial(num)}")
}

fun factorial(n: Int): Long {
    return if (n == 0) 1 else n * factorial(n - 1)
}

