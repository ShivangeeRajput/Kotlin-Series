package com.example

fun main() {
   val p1= Person("A",20,"M")
   val p2= Person("B",18,"F")


}
class Person(nameparam:String,ageParam:Int,sex:String){
    var name:String=nameparam
    var age:Int=ageParam
}