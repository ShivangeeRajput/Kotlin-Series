package com.example

fun main() {
    val name="John Doe"
    name.let {
        println("Name is $it")
    }
    val result="Kotlin".run {
        this.length
    }
    println(result)
    val length = with("Kotlin") {
        length
    }
    println(length)
    val namee = "John Wick".also {
        println("Original name is $it")
    }

}