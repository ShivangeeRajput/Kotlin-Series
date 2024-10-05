package com.example.program


//hackerrank SDE Intern Task
fun getDistance(word: String): Int {
    var totalDistance = 0

    for (i in 1 until word.length) {
        val currentChar = word[i]
        val previousChar = word[i - 1]

        totalDistance += Math.abs(currentChar - previousChar)
    }

    return totalDistance
}

fun main(args: Array<String>) {
    val word = readLine()!!

    val result = getDistance(word)

    println(result)
}
