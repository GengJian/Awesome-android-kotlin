package com.soul.awesome.kotlin

// class关键词声明一个类，主构造函数函数指定属性
open class Person(name: String, age: Int) {
    var name = ""
    var age = 0

    fun eat() {
        println(name + " is eating . He is " + age + "years old.")
    }

}