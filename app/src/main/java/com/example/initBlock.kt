package com.example

class Mentorr(firstName:String,lastName:String){
    init {
       println("First init block: $firstName $lastName")
    }
    private val fullName = "$firstName $lastName".also { println("FullName property") }
    //secondary constructor
    constructor(firstName:String,lastName:String,interest:String):this(firstName,lastName){
        println("Secondary Constructor: $interest")
    }
    init {
        println("Second init block : ${fullName.length}")
    }
}

fun main() {
    val m1=Mentorr("John","Cena","Android")
    println(m1)
}