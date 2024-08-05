package com.example

data class Guide(val name: String, val age: Int)
fun main(){
    val guide= arrayOf(
        Guide("John",25),
        Guide("Jane",30),
        Guide("John",25),
        Guide("Jenny",30)
    )
//    val distinct=guide.distinct()
//    val distinct=guide.toSet()
//    val distinct=guide.toHashSet()
      val distinct=guide.toMutableSet()
      println(distinct)
}