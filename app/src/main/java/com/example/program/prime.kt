package com.example.program

fun isPrime(number: Int): Boolean {
    if (number < 2)
        return false
    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    val num = 11
    if (isPrime(num)) {
        println("$num is a prime number")
    } else {
        println("$num is not a prime number")

    }
}

