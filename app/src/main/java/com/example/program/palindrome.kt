package com.example.program

fun isPalindrome(input:String):Boolean{
    val reversedInput=input.reversed()
   return input==reversedInput
}

fun main() {
    print("Enter a string:")
    var str= readLine()?:""
    if (isPalindrome(str)){
        println("$str is palindrome")
    }
    else
        println("$str is not palindrome")
}


