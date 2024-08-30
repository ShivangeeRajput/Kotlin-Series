package com.example

fun main(){
    data class Mentor(val id: Int, val name: String)
    val mentors = arrayOf(
        Mentor(1, "John Wick"),
        Mentor(2, "John Cena"),
        Mentor(1, "John Wick"),
        Mentor(3, "John"))
    val distinct = mentors.distinct()
    println(distinct)

}