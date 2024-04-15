package com.example

//
//fun com.example.main() {
//    val d=Day.TUESDAY
//    println(d)
//    println(d.number)
//}
////in enum class we restric values like from these 3 we have to choose
//// whereas in sealed class we restrict types,also enum has only one object its state are not changed,
//// whereas we can change the state of the sealed class
//enum class Day(val number:Int){
//    SUNDAY(1),
//    MONDAY(2),
//    TUESDAY(3),
//    WEDNESDAY(4),
//    THURSDAY(5),
//    FRIDAY(6),
//    SATURDAY(7),
//
//}
//sealed class
fun main() {
//  val t: Tile = Red("Mushroom",25)
//
//   val Value=when(Tile){

   }

//}
sealed class tile
class Red(Type:String,Value:Int): tile()
class Blue(Type: String,Value: Int): tile()