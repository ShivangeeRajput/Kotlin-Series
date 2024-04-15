package com
 fun main(){
    val r= add(4,5)
    val e= sub(10,5)
     println(r)
     print(e)
 }
fun add(num1:Int,num2:Int):Int{
    val sum=num1+num2
    return sum


}
fun sub(num1: Int,num2: Int):Int {
    val result=num1-num2
    return result

}