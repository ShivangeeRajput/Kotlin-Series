package com.example.program

class reverseNum{
    fun isReverse(x:Int):Int{
        var num=x
        var reverse=0
        while(num!=0){
            val digit=num%10
            reverse=reverse*10+digit
            num/=10
        }
        return reverse
    }
}

fun main() {
    val result=reverseNum().isReverse(1234)
    println(result)
}