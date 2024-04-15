package com.example

fun main() {
   val obj=Outer()
    obj.i

    val nested=Outer().Nested()
        nested.test()
}

class Outer{
    val i=0
    inner class Nested{
        fun test(){
            println("This is a nested class $i ")
        }
    }
}