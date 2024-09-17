package com.example.program

fun main() {
   println("Enter a string: ")
   val str= readLine() ?:""
    if (isPalindrome(str))
        println("$str is a palindrome")
    else
        println("$str is not a palindrome")
}

fun isPalindrome(input:String):Boolean{
    val reversedInput=input.reversed()
    return input==reversedInput
}