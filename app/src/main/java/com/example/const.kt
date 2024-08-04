package com.example

object Constants{
    const val NAME="Amit"
}
fun testValWithConstant(){
    val name=Constants.NAME
}

//if we don't use the const var then we will get the instance of the name
// that is not the best practice and if we do use the const then the value will be inclined
// not the variable name
