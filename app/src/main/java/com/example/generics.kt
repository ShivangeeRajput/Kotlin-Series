package com.example

fun main() {
    val iContainer=Container<Int>(30)
    iContainer.setValue(3)
    iContainer.getValue()
    val sContainer=Container<String>("Hello World")
    sContainer.getValue()

}
//if we are creating a container for like integer and in future we have to create same for double or string so we
//dont need to create the container again and again we can simple create a generics class
//generic class
class Container<T>(var data:T) {
    fun setValue(value: T) {
        data= value
    }
    fun getValue():T {
        return data
    }
}