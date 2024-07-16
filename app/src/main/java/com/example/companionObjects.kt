package com.example

fun main() {
    myClass.myObject.f()
    //if we dont want to use the reference of the myobject then we have to make object as companion object
    // then we can access without using myobject reference

    myClass.f()
    myClass.anotherObject.f2()

}
class myClass{
   companion object myObject{
        fun f(){
          println("Hello world")
        }
    }
     object anotherObject{
        fun f2(){
            println("Hello again")
        }
    }
}