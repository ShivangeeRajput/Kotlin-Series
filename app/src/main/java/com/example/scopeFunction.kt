package com.example

fun main() {
    val emp = Employee()

    // APPLY: Initialize and configure the object
    emp.apply {
        name = "Sean"
        designation = "CEO"
    }
    println(emp)

    // LET:Use when you have to perform multiple operation on a object, exclude nulllable obj
    // Perform actions on a nullable object
    val emp2: Employee? = null
    emp2?.let {
        println(it.name)
        println(it.designation)
    }

    // WITH: Configure the object and operate within its scope
    with(emp) {
        name = "Ryan"
        designation = "CTO"
    }
    println(emp)

    // RUN: Perform actions and return the result
    emp.run {
        name = "Alex"
        designation = "CFO"
    }
    println(emp)

    // ALSO: Perform additional actions without modifying the object
    emp.also {
        println("Logging before any changes: Name=${it.name}, Designation=${it.designation}")
    }.apply {
        name = "Mia"
        designation = "CMO"
    }
    println(emp)
    val name = "John Wick".also {
        println("Original name is $it")
    }
    //WITH-configure the object but return different result
    val name_desig=with(emp){
        "$name $designation"
    }

}

data class Employeee(var name: String = "", var designation: String = "Developer")


//when to use apply and with
//use APPLY when you want to confingure and return the same object means you modify the object and keep the object as it is
//use WITH when you want to perform task on the objects but return different result,
