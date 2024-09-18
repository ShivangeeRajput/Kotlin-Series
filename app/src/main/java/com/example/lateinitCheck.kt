package com.example

class Example {
    lateinit var name: String

    fun checkInitialization() {
        if (::name.isInitialized) {
            println("Lateinit variable is initialized with: $name")
        } else {
            println("Lateinit variable is not initialized")
        }
    }
}

fun main() {
    val example = Example()
    example.checkInitialization() // Outputs: Lateinit variable is not initialized

    example.name = "Hello"
    example.checkInitialization() // Outputs: Lateinit variable is initialized with: Hello
}

