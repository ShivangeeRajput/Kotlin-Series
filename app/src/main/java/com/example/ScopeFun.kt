package com.example

fun main() {
    val emp = Employee()
    emp.name="John"
    emp.designation="Manager"
    //other than writing we can use apply function
    emp.apply {
        name="Sean"
        designation="CEO"
    }
    println(emp)
    //other than writing println(emp.name),println(emp.designation)) use let function
    //val emp :? Employee=null (in this case also you can use apply function)
    emp?.let {
        println(it.name)
        println(it.designation)
    }
    with(emp){
        name="Ryan"
        designation="CTO"
    }
    emp.run {
        name="Alex"
        designation="CFO"
    }
}
data class Employee(var name:String="",var designation:String="Developer"){

}