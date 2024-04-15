package com.example

fun main() {
//   val mustang= car("Mustang","Petrol",40)
//   val bmw= car("BMW","Diesel",120)
//   mustang.runCar()
//    mustang.appliedBrakes()
//    bmw.type
      var person= person("A",20)
      var person2= person("B",18)
      println(person.age)
      println(person.name)
      println(person2.age)
      println(person2.name)



}
//class car(val name:String,val type:String,val kmRan:Int){
// creating function
//    fun runCar(){
//        println("Car is running")
//    }
//    fun appliedBrakes(){
//        println("Break Applied")
//    }
    class person(nameParam:String,ageParam:Int)// creating constructors
{
        val name:String=nameParam
        val age:Int=ageParam
        init {    //init block it will be executed everytime when new statements are created
            println("$name is created")
        }
    }
//lateint : we don't know the initializing value of the variable then we use the leteinit,it is always used with var.