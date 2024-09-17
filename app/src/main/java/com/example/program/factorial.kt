package com.example.program


fun main(){

}
fun factorial(n: Int):Long {
    return if(n==0) 1 else n * factorial(n - 1)
}