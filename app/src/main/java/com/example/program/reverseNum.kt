package com.example.program

fun reverseNumber(number: Int): Int {
    var num = number
    var reversed = 0
    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    return reversed
}

fun main() {
    val num = 1234
    println("Reversed Number: ${reverseNumber(num)}")
}