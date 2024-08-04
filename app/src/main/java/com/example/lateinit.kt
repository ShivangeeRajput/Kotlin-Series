package com.example


class Mentor {
}

class Session {
    private lateinit var mentor: Mentor

    fun initializeMentor() {
        mentor = Mentor()
    }
}
