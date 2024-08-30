package com.example

class Mentorrr {

}
class Sessionnn {
    private val mentor: Mentor by lazy { Mentor() }
    fun getMentor(): Mentor {
        return mentor
    }
    val name: String by lazy {
        println("Hello World")
        "Hello"
    }
}
