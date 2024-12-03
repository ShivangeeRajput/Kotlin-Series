package com.example

data class Contact(val name:String,val number: String)

fun main() {
    val contacts= listOf(
        Contact("John Doe","70xxxxxx23"),
        Contact("John Cena","89xxxxxxxxx"),
        Contact("John Abraham","98xxxxxxx")
    )
    val map=contacts.associateBy({it.name},{it.number})
    println(map)
    val employee= listOf(
        Employee3("john","Wick"),
        Employee3("John","Cena")
    )
    println(employee.associateBy({it.fname},{it.lname}))
}

// associateBy let us convert a list into a map.
data class Employee3(val fname:String,val lname:String)