package com.example

fun main() {
    val emp = Employee()
//    emp.name="John"
//    emp.designation="Manager"
    //other than writing we can use apply function
    //APPLY
    emp.apply {
        name="Sean"
        designation="CEO"
    }
    println(emp)
    //1-other than writing println(emp.name),println(emp.designation)) use let function
    //val emp :? Employee=null (in this case also you can use apply function)
    val emp2:Employee?=null
    emp2?.name="John"
    emp2?.designation="Manager"
    //2-other than using safe call (?.) again and again
    // create a let scope fun in which all the objects are non nullable
    //LET
    emp2?.let {
        println(it.name)
        println(it.designation)
    }
    //WITH
    //with is same as let but here we dont need to write it again and again
    with(emp){
        name="Ryan"
        designation="CTO"
    }
    //RUN
    emp.run {
        name="Alex"
        designation="CFO"
    }
}
data class Employee(var name:String="",var designation:String="Developer"){

}