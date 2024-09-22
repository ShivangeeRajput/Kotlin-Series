package com.example.program

class numPalindrome{
    fun isPalindrome(x:Int):Boolean{
        if(x<0) return false
        var num=x
        var reverse=0
        while (num != 0){
            val digit=num%10
            reverse=reverse * 10 + digit
            num/=10
        }
        return reverse==x
    }
}

fun main() {
    val result=numPalindrome().isPalindrome(121)
    println(result)
}