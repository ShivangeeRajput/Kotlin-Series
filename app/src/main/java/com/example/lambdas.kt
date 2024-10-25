package com.example

fun main(){

    println(sub(10.0,5.0))
    //declaring fun as a variable
    var fn: (num1: Double, num2:Double) -> Double = :: sub
    println(fn(40.0, 30.0))
    println(calculator(10.0,20.0,::sub))
    //lambda fun
    val lambda1={x: Int,y: Int -> x+y}
    val multilineLambda: () -> Unit ={
        println("Hello lambda")
        val a=2+3
        "Hello World"
        val b=2.4
    println(res2)
    }
    multilineLambda()
    val singleParamLambda={x:Int -> x * x}
    println(singleParamLambda(10))

    //here  {x ->x+x} == {it + it}
    val singleParam: (Int) -> Int ={x ->x+x}
    val simplifySingleParam: (Int)->Int ={it + it}
    println(simplifySingleParam(2))
    println(singleParam(3))
    println(calculatorr(60,50,::sum))

}

fun sub(num1: Double,num2: Double):Double {
    return num1-num2
}
//Higher order function as it is taking fun as  a arguement
fun calculator(a:Double,b:Double,gn:(Double,Double)->Double):Double {
   return gn(a,b) //returning fun
}

fun calculatorr(e:Int,f:Int,gt:(Int,Int)->Int): Int {
   return gt(e,f)
}

//Normal function
fun sum(a:Int,b:Int):Int{
    return a+b
}
//lambda function
val sum= {a:Int,b:Int -> a+b}

// Higher-order function that takes a lambda as a parameter
fun performOperation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

// Lambda function to add two numbers
val add: (Int, Int) -> Int = { a, b -> a + b }

// Using the higher-order function with the lambda
val result = performOperation(5, 3, add)

val numbers= listOf(1,2,3,4,5,6)
val res2= numbers.map { it*2 }
val res= numbers.filter { it % 2 == 0 }

