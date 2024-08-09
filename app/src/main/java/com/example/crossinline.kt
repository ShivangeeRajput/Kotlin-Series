package com.example

//crossinline is used to avoid non local return
//we cant put any return inside that lambda
inline fun teachhh(crossinline abcd:()->Unit){
    abcd()
}
fun Guide(){
    println("Guide start")
    teachhh {
        println("abcd start")
    }
    println("Guide end")
}