package com.example

class lateinitCheck {
    lateinit var name: String

  fun checkInitialization(){
      if(::name.isInitialized){
          println("Lateinit is initialized with $name")
      }
      else
        println("Lateinit is not initialized")
  }
}

fun main() {
    val check = lateinitCheck()
    check.checkInitialization() // Output: Lateinit variable is not initialized

    check.name = "John Wick"
    check.checkInitialization() // Output: Lateinit variable is initialized with: Hello
}

