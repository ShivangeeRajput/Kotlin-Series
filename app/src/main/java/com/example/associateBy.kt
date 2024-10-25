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
}

// associateBy let us convert a list into a map.
