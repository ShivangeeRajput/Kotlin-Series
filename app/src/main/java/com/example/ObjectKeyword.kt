package com.example//fun com.example.main() {
//    SharingWidget.incrementfblikes()
//    SharingWidget.incrementTwitterlikes()
//    SharingWidget.incrementTwitterlikes()
//    SharingWidget.incrementTwitterlikes()
//    SharingWidget.incrementTwitterlikes()
//    SharingWidget.incrementTwitterlikes()
//    SharingWidget.incrementfblikes()
//    SharingWidget.incrementfblikes()
//    SharingWidget.display()
//}
//
//object SharingWidget{
//    var fblikes=0
//    var twitterlikes=0
//
//    fun incrementTwitterlikes() = twitterlikes++
//    fun incrementfblikes()= fblikes++
//    fun display()=println("Facebook - $fblikes  Twitter-$twitterlikes")
//
//
//}

//object expression-work as a anonymus object
fun main() {
    var obj=object: Clonable {
        override fun clone() {
            println("I am clone")
        }

    }
    obj.clone()
}
interface Clonable{
    fun clone()
}