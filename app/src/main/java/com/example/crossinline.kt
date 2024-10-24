package com.example

//crossinline is used to avoid non local return
//we can't put any return inside that lambda

fun Guide(){
    println("Guide start")
    teachhh {
        println("abcd start")
        //return is not allowed here as we have used the crossinline keyword
    }
    println("Guide end")
}
inline fun teachhh(crossinline abcd:()->Unit)  //Unit represents that the function does not return anything
{
    abcd()
}