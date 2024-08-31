package com.example

fun main() {
    val emp = Employee()

    // APPLY: Initialize and configure the object
    emp.apply {
        name = "Sean"
        designation = "CEO"
    }
    println(emp)

    // LET: Perform actions on a nullable object
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
}

data class Employeee(var name: String = "", var designation: String = "Developer")
