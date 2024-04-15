package com.example.inheritance

fun main() {
 val oneplus =oneplus()
    oneplus.display()
    println(oneplus.toString())
//    val generalmobile=phone("General")
//    generalmobile.display()
}

 open class phone(val type:String) {
     open  val name:String=""
     open val size:Int=20
     val volume:Int=10

     fun makecall() {println("making a call")}
     fun receivecall(){println("receiving a call")}
     fun sendmessage(){println("sending a message")}
     fun receivemessage(){println("receiving a message")}
     fun getdeviceinfo(){println("getting device info")}
     open fun display(){println("simple mobile display")}
}
 class oneplus:phone("Mobile"){
     override val name:String="Oneplus"
     override val size: Int=10

     override fun toString(): String {
         return "oneplus(name='$name', size=$size)"
     }

 }
