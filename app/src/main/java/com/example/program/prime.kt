package com.example.program

fun isPrime(num:Int):Boolean{
    if(num<2)
        return false
    for(i in 2 ..num/2){
        if (num%i ==0)
        return false
    }
    return true
}

fun main() {
    val num = 32
    if (isPrime(num)) {
        println("$num is a prime number")
    } else {
        println("$num is not a prime number")

    }
}

