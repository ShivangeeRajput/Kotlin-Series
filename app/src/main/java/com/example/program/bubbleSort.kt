package com.example.program

fun bubbleSort(arr: IntArray): IntArray {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}

fun main() {
    val array = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Sorted array: ${bubbleSort(array).joinToString(", ")}")
}
