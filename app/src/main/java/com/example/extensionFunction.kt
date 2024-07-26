package com.example

//extension function: we can extend a class without inheriting its functionality.
 class Circle2(val radius: Double){
    fun area(): Double{
        return Math.PI*radius*radius
    }
}
fun main(){
    // Extension function created for a class Circle
    fun Circle2.perimeter(): Double{
        return 2*Math.PI*radius;
    }
    // create object for class Circle
    val newCircle = Circle2(2.5);
    // invoke member function
    println("Area of the circle is ${newCircle.area()}")
    // invoke extension function
    println("Perimeter of the circle is ${newCircle.perimeter()}")
}