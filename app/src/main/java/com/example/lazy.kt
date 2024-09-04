package com.example

class Mentorrr {

}
class Sessionnn {
    private val mentor: Mentor by lazy { Mentor() }
    fun getMentor(): Mentor {
        return mentor
    }
    val name: String by lazy {
        "John"
    }
     val lastName: String by lazy {
        "Doe"
    }
}
class Session2 {

    private val mentor: Mentor by lazy { Mentor() }

}