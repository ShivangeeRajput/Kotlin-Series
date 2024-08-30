package com.example

fun main() {
    myClass.myObject.f()
    myClass.f()
    myClass.anotherObject.f2()
    //NOTE- if we dont want to use the reference of the myobject then we have to make object as companion object
    // then we can access without using myobject reference
}

class myClass{
    companion object myObject{
        @JvmStatic
        fun f(){
            println("Hello World")
        }
    }
    object anotherObject{
        fun f2(){
            print("Hello again")
        }
    }
}