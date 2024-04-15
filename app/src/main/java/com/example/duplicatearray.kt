package com.example

fun main(){
    data class Mentor(val id: Int, val name: String)
    val mentors = arrayOf(
        Mentor(1, "Amit Shekhar"),
        Mentor(2, "Anand Gaurav"),
        Mentor(1, "Amit Shekhar"),
        Mentor(3, "Lionel Messi"))
    val distinct = mentors.distinct()
    println(distinct)

}