package com.example

//fun com.example.main() {
////    var score=5
////    score=10
////    println(score)
////    val message="Hello world"
//////    var message="Whatcha doing"
////    println(message)
//    var score:Int=4
//    var message: String ="hello world"
//    println(score)
//    println(message)
//
//
//
//}
fun main() {
 val result= add(4,5)
    println(result)
    evenorodd(7)
    evenorodd(14)
    printMessage(4)//count arguements

}
fun add(a:Int,b:Int) = a + b //inline function
//{
//    val sum=a+b
//    return sum
//}

fun evenorodd(num:Int){
    val r=if(num % 2==0) "Even" else "Odd"
    println(r)
}
fun printMessage(count:Int=2){//count parameters
    for (i in 1..count)
        println("Hello $i")
}