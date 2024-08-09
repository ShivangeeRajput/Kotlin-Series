package com.example

fun main() {

}
fun Guidee() {
    print("guide start")
    teachh({
        print("teach abc")
    }, {
        println("teach xyz")
       }
    )
    print("guide end")
}

inline fun  teachh(abc:()-> Unit, noinline xyz:()-> Unit) {
    abc()
    xyz()
}
