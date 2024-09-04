package com.example

fun main() {
    //list
    val num= listOf(1,2,3,4,5,6)
    println(num.indexOf(3))
    println(isOdd(2))
    println(isOdd(3))
    //filter
    val list=num.filter(::isOdd)
    println(list)
    //map
    val list2= num.map{it * it}
    println(list2)
    //forEach
    num.forEach{ println(it) }
    //reduce
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.reduce { acc, number -> acc + number }
    println(sum) // Output: 15

}
fun isOdd(a:Int): Boolean {
    return a % 2 != 0
}