package com.example

fun main() {
    val emp : Employee ?=null
    emp?.name="John"
    emp?.designation="Manager"
    //other than writing we can use apply function
    emp?.apply {
        name="Sean"
        designation="CEO"
    }
    println(emp)
    //other than writing println(emp.name),println(emp.designation)) use let function
    emp?.let {
        println(it.name)
        println(it.designation)
    }
}
data class Employee(var name:String="",var designation:String="Developer"){

}