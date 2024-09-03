package com.example

fun main() {

}
fun guide() {
    print("guide start")
    teach()
    print("guide end")
}

inline fun  teach() {
    print("teach")
}

//higher order and lambda functions
fun guidee(){
    print("guide start")
    teachh {
        print("teach")
    }
    print("guide end")
}
inline fun teachh(abc:() -> Unit)
{
    abc()
}
////When a function returns Unit,
// it means that the function does not return any meaningful value.
