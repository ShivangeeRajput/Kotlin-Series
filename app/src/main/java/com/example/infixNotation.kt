package com.example


//Infix notation in Kotlin allows a function to be called without the use of the dot and parentheses.

infix fun Int.add(value:Int):Int=this + value
fun main() {
    val sum= 5 add 10 //or 5 add(10+15)
    println(sum)
}

//val map = mapOf(
//    1 to "Amit Shekhar",
//    2 to "Anand Gaurav",
//    3 to "Lionel Messi"
//)
//fun main(args: Array<String>) {
//    var a = 15
//    var b = 12
//    var c = 11
//    // call using dot and parenthesis
//    var result1 =(a > b).and(a > c)
//    println("Boolean result1 = $result1")
//    // call using infix notation
//    var result2 =(a > b) and (a > c)
//    println("Boolean result1 = $result2")
//}


