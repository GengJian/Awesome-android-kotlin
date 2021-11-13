package com.soul.awesome.kotlin

// 主构造函数 可以在实例化时 初始化属性
open class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age) {
    init {
        println("-- 实例化Student --")
        println("sno is $sno")
        println("grade is $grade")
        println("name is $name")
        println("age is $age")

    }

    // 次构造函数
    constructor(name: String, age: Int) : this("", 0, name, age) {

    }

    // 次构造函数（无参）
    constructor(): this("",0,"",0)

}