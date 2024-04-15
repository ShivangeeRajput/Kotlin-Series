fun main() {
//dragObjects(arrayOf(Circle(5.0),Square(4.0)))
}
fun dragObjects(objects: Array<Shape>){
    for(obj in objects){
      obj.drag()
    }
}
//interface behaves same as the abstarct class
//Usage: Abstract classes are typically used when you want to provide a
// common base class with some shared behavior and leave room for customization by subclasses.
// Interfaces are used when you want to define a contract that multiple classes can adhere to,
// regardless of their inheritance hierarchy.
interface Draggable{
    fun drag()
}

 abstract class Shape:Draggable{
    abstract fun area():Double

}


class Circle(val radius:Double):Draggable{
     fun area():Double=Math.PI* radius* radius
    override fun drag()= println("Circle is dragging")


}
class Square(val side:Double):Shape() {
    override fun area(): Double =side*side
    override fun drag()= println("Square is dragging")
    }
class Player(val name:String){
    fun drag()= println("$name is dragging")
}

