package com.soul.awesome.kotlin

// 继承Person主构造函数 可以在实例化时 初始化属性
// 实现接口 Study
open class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age), StudyInterface {
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

    override fun readBooks() {
        println(name + " is reading.")
    }

    override fun doHomeworks() {
        println(name + " is doing homeworks.")
    }

}