package com.example

fun main() {
   val obj=intContainer(3)
    println(obj.getValue())

    val iContainer=Container<Int>(5)
    iContainer.getValue()
    val sContainer=Container<String>("Hello")
    sContainer.getValue()

}

class intContainer(var data:Int){
    fun setValue(value: Int) {
        data= value
    }
    fun getValue():Int {
        return data
    }
}
//instead of creating the same for all data types just create a generic class with <t>
// as type ner again and again we can simple create a generics class
//generic class are independent of any type of data
class Container<T>(var data:T) {
    fun setValue(value: T) {
        data= value
    }
    fun getValue():T {
        return data
    }
}