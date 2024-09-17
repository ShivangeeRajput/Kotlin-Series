package com.example.program

fun main() {
    print("Enter a number: ")
    val num= readLine()?.toIntOrNull()?:return
    println("Fibonacii number upto $num is ${fibonacciNum(num)}")
}

fun fibonacciNum(num:Int):List<Int>{
    val sequence = mutableListOf(0, 1)
    var next = sequence[1]
    while (next <= num) {
        next = sequence[sequence.size - 1] + sequence[sequence.size - 2]
        if (next <= num) {
            sequence.add(next)
        }
    }
    return sequence
}