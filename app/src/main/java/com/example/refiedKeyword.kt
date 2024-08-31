package com.example

inline fun <reified T> printType(value:T)
{
    println(T::class.java.simpleName)
}

fun main() {
    printType<String>("Generics")
    printType<Int>(10)
}




