package com.soul.awesome.kotlin

import kotlin.math.max
import kotlin.math.min

fun main() {
    println("Hello Kotlin!")

    // 声明变量（带类型）
    val a: Int = 99
    // 简写变量（推导类型）
    val b = 108

    val value1 = largerNumber(a,b)
    println("larger number is " + value1)

    val value2 = smallerNumber(a,b)
    println("smaller number is " + value2)
}

// 函数写法
fun largerNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}
// 函数语法糖(含返回值类型推导)
fun smallerNumber(num1: Int, num2: Int) = min(num1, num2)

class LearnKotlin {

}

