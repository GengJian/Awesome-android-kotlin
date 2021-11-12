package com.soul.awesome.kotlin

import kotlin.math.max
import kotlin.math.min

fun main() {
    println("Hello Kotlin!")

    // 声明变量（带类型）
    val a: Int = 99
    // 简写变量（推导类型）
    val b = 108

    val value1 = largerNumber(a, b)
    println("larger number is " + value1)

    val value2 = smallerNumber(a, b)
    println("smaller number is $value2")

    // 测试When 写法
    println(getScore1("Jim"))
    println(getScore2("Tommy"))
}

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

class LearnKotlin {

}

