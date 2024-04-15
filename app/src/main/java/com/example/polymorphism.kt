package com.example

fun main() {
val circle=Circle(4.0)
    println(circle.area())
    circle.display()


}
 abstract class Shape(){
    var name:String=""
     abstract fun area():Double
     abstract fun display()
    }

 class Circle(val radius:Double):Shape(){
    override fun area():Double=Math.PI* radius* radius
     override fun display() {
         println("Circle is being displayed")
     }


 }
    class Square(val side:Double):Shape() {
        override fun area(): Double =side*side
        override fun display() {
        println("Square is being displayed")
    }
}
