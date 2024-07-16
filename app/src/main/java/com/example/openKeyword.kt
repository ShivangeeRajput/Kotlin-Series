package com.example

//class Person1{}
//class testPerson: Person1() {}
//here it was showing error as in kotlin we cant inherit the class that is not open , but in
// java all classes are open by default and we have to use final to prevent inheritance

//open keyword for class, fun & val
open class Person1{
   open val name="John"
    open fun test(){
}
class testPerson: Person1() {
    override val name="Smith"
    override fun test(){}

}
 }