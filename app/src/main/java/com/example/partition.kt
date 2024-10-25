package com.example

data class User(val id:Int,val name:String,val isMentor:Boolean)

fun main() {
    val users = arrayOf(
        User(1, "John", true),
        User(2, "Ronaldo", false),
        User(1, "Messi", true),
        User(3, "Neymar", false)
    )
    val (mentors,notMentors)=users.partition { it.isMentor }
    println(mentors)
    println(notMentors)
    //Partition: Used for filtering the list-> it creates 2 list one for true and other for false
}


