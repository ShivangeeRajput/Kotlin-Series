package com.example

class Car(val model: String, var speed: Int, var fuel: Int) {

    init {
        require(speed >= 0) { "Speed must be non-negative" }
        require(fuel in 0..100) { "Fuel level must be between 0 and 100" }
        println("Car initialized: Model=$model, Speed=$speed, Fuel=$fuel")
    }
    init {
        val modelFuel="$model has $fuel"
        println(modelFuel)
    }
}

fun main() {
    val validCar = Car("Toyota", 60, 50)
    // Output: Car initialized: Model=Toyota, Speed=60, Fuel=50

    // Uncommenting this line will throw an IllegalArgumentException
    // val invalidCar = Car("Honda", -10, 110)
    // Output: Exception in thread "main" java.lang.IllegalArgumentException: Speed must be non-negative
}
class Mentor2(val fname:String,val lname:String){
    init {
        val fullName="$fname $lname"
        println(fullName)
    }
}
