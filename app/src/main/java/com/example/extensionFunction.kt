package com.example

fun main() {
    //Extension fun created for class Circle
    fun Circle2.perimeter(): Double {
        return 2 * Math.PI * radius
    }
    //invoked the extension fun
    val newCircle=Circle2(4.0)
    println("Area of circle is ${newCircle.area()}")
    println("Perimeter if circle is ${newCircle.perimeter()}")
}
class Circle2(val radius:Double){
    fun area():Double{
        return Math.PI*radius*radius
    }
}

//Extension function: we can extend a class without inheriting its functionality.
//It is defined outside of the class but can be called as if it were a member of the class