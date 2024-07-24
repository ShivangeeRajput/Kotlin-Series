package com.example

//extension function: we can extend a class without inheriting its functionality.
fun main() {
    var agesStage=AgesStage()
    println("Is I AM Adult :- "+agesStage.hasAdult(27))
}
class AgesStage(){
    fun hasAdult(age: Int): Boolean{
        if(age>18){
            return true
        }else{
            return false
        }
    }
}