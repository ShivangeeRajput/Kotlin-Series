package com.example


class Mentor {
}

class Session {
    private lateinit var mentor: Mentor
    private lateinit var designation: String
    lateinit var name:String

    fun initializeMentor() {
        mentor = Mentor()
    }
    fun setUp(){
        name="John Wick"
        designation="Baba Yaga"
    }
}
