package com.example

fun main() {
    val emp=Employee()
//    emp.name="John"
//    emp.desination="Manager"

    //other than writing we can use apply function
    //apply fun
    emp.apply {
        name="Sean"
        designation="CEO"
    }
    println(emp)
}
data class Employee(var name:String="",var designation:String="Developer"){

}