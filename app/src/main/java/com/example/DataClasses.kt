package com.example

fun main() {
    val person1= Personn("Max","Silicon Valley","M")
    val person2= Personn("Rhys","Las Vegas","M")

    val p3=person1.copy("Sam")//copy
    println(p3)
    println(person1)//tostring
    println(person2)
    println(person1.hashCode())
    println(person1 == person2)//p1 equals p2
}
data class Personn(var name:String, val Address: String, val Sex:String)



