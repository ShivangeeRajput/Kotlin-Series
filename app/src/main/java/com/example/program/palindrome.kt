package com.example.program

fun main() {
    print("Enter a String: ")
    val str= readLine()?:""
    if (isPalindrome(str))
        println("$str is a palindrome")
    else
        println("$str is not a palindrome")

}
fun isPalindrome(input:String):Boolean{
    val reverseInput=input.reversed()
    return input==reverseInput
}