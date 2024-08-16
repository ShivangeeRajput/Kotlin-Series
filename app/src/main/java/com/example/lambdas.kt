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
fun calculator(a:Double,b:Double,gn:(Double,Double)->Double) {
    val result=gn(a,b)
    println(result)
}

fun calculatorr(e:Int,f:Int,gt:(Int,Int)->Int){
    val result1=gt(e,f)
    println(result1)
}

//Normal function
fun sum(a:Int,b:Int):Int{
    return a+b
}
//lambda function
val sum= {a:Int,b:Int -> a+b}

