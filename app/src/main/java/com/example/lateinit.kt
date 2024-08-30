package com.example


class Mentor {
}

class Session {
    private lateinit var mentor: Mentor
    lateinit var name:String

    fun initializeMentor() {
        mentor = Mentor()
    }
    fun setUp(){
        name="John Wick"
    }
}
