package com.example

//import java.sql.Date
//
//fun main() {
//    val session=Session("Session",Date())
//    val name= session.name
//    val sessionOne=Session("SessionOne",Date())
//    val sessionTwo=Session("SessionTwo")
//    val sessionThree=Session("SessionThree",Date())
//}
//
////data class Session(@JvmField val name: String, val date: Date=Date()) for jvmfield-if we dont want to
////use the getter method use Jvmfield instead
//data class Session @JvmOverloads constructor(val name: String, val date: Date = Date()) //for jvmOverloads
data class Sessionn @JvmOverloads constructor(val name:String,val id :Int=0)