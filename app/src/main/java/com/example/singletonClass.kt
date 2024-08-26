package com.example

//fun main() {
//    val obj1=singletonClass()
//    val obj2=singletonClass()
//    println(obj1.toString())
//    println(obj2.toString())
//}
//class singletonClass {
//}
 //instead of this we will create the singleton object class

//first example
//fun main() {
//    println(user.toString())
//    println(user.toString())
//}
////user is the singleton class here
//object user{}

//second example
object mySingleton{
    var data:String?=null
    fun doSomething() {
        println("Singleton is working with data: $data")
    }
}

fun main() {
    mySingleton.data="HELLO WORLD:)"
    mySingleton.doSomething()
}