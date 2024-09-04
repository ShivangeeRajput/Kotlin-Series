package com.example

data class Car2(val Color:String)

fun main() {
    val car=Car2("Red")
    val carr=car
    println(car == carr) //structural equality
    println(car === carr) //referential equality

}