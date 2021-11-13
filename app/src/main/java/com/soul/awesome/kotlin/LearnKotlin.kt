package com.soul.awesome.kotlin

import kotlin.math.max
import kotlin.math.min

//<editor-fold desc="主函数">
fun main() {
    println("Hello Kotlin!")

//    // 声明变量（带类型）
//    val a: Int = 99
//    // 简写变量（推导类型）
//    val b = 108
//
//    val value1 = largerNumber(a, b)
//    println("larger number is " + value1)
//
//    val value2 = smallerNumber(a, b)
//    println("smaller number is $value2")
//
//    // 测试When 写法
//    println(getScore1("Jim"))
//    println(getScore2("Tommy"))

//    //测试函数写法
//    testMethod()

//    //测试数据类
//    testDataObject()
//
//    // 测试单例
//    Singleton.singletonTest()

//    testList()
//    testSet()
    testMap()

}

//</editor-fold>

//<editor-fold desc="测试实例函数">

// 函数写法
fun largerNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

// 函数语法糖(含返回值类型推导)
fun smallerNumber(num1: Int, num2: Int) = min(num1, num2)

// when函数相当于switch函数，并且可以直接返回值
fun getScore1(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}

fun getScore2(name: String) = when {
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}

private fun testMethod() {
//    // 通过调用主构造函数，并设置初始值
//    val student1 = Student("Jack", 19)
//    // 调用次构造函数
//    val student2 = Student("a123", 5, "Lily", 18)
//    // 不带参构造函数
//    val student3 = Student()
//
//    doStudy(student1)
//    doStudy(student2)
}

// 测试接口实现
fun doStudy(student: Student) {
    println("-- someone do study -- ")
    student.readBooks()
    student.doHomeworks()
}

// 测试单例实现
private fun testDataObject() {
//    val cellphone1 = CellphoneModel("Samsung", 1299.99)
//    val cellphone2 = CellphoneModel("HUAWEI", 4388.88)
//    val cellphone3 = CellphoneModel("Samsung", 1299.99)
//
//    println(cellphone2)
//    println("cellphone1 equals cellphone3 " + cellphone1.equals(cellphone3))
}

fun testList() {
    println("测试不可变数组")
    // 不可变集合
    val list = listOf<String>("Apple", "Pear", "Banana", "Orange")
    for (fruit in list) {
        println(fruit)
    }
    println("测试可变数组")
    // 可变集合
    val mutableList = mutableListOf<String>("Apple", "Pear", "Banana", "Orange")
    mutableList.add("WaterMelon")
    mutableList.remove("Pear")
    for (fruit in mutableList) {
        println(fruit)
    }

}

fun testSet() {
    val set = setOf<String>("Apple", "Pear", "Apple", "Orange")
    for (fruit in set) {
        println(fruit)
    }
}

fun testMap() {
    val map = mapOf(
        "Apple" to 1,
        "Pear" to 2,
        "Banana" to 3
    )
    for (fruit in map) {
        println(fruit)
    }
}


//</editor-fold>

