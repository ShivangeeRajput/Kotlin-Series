package com.example

class Mentorrr {

}
class Sessionnn {
    private val mentor: Mentor by lazy { Mentor() }
    fun getMentor(): Mentor {
        return mentor
    }
}
