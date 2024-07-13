package com.example

fun main() {
    val emp=Employee()
//    emp.name="John"
//    emp.desination="Manager"

    //other than writing we can use apply function
    //apply fun
    emp.apply {
        name="Sean"
        desination="CEO"
    }
    println(emp.name)
    println(emp.desination)
}
data class Employee(var name:String="",var desination:String="Developer"){

}