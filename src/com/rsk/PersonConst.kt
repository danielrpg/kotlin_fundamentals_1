package com.rsk

class PersonConst(var Name: String) {
    fun display() {
        println("Display: ${Name}")
    }

    fun displayWithLambda(func:(s:String) -> Unit) {
        func(Name)
    }
}