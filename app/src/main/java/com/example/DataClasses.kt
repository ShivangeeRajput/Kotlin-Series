package com.example

fun main() {
    val person1= Person7("Max",45,"M")
    val person2= Person7("Rhys",76,"M")

    val p3=person1.copy("Sam")//copy
    println(p3)
    println(person1)//tostring
    println(person2)
    println(person1.hashCode())
    println(person1 == person2)//p1 equals p2

    val e1=Employeeee("John","Wick",24)
    val e2=e1.copy("John","Cena")
    e1.toString()
    e1.hashCode()
    println(e1==e2)

}
data class Person7(val name: String, var age: Int, val sex: String)
data class Employeeee(val fname:String,val lname:String,val age:Int)