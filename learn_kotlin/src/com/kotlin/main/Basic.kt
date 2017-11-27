package com.kotlin.main

/**
 * Created by Wuxiang on 2017/11/27.
 */

// 1. 函数定义
// 写法1
//fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
//    return a + b
//}

// 写法2
//fun sum(a: Int, b: Int) = a + b  // 表达式作为函数体，返回类型自动推断

// 写法3
public fun sum(a: Int, b: Int): Int = a + b   // public 方法则必须明确写出返回类型

// 无返回值的函数（Unit类似于java 的void）
fun printSum(a: Int, b: Int): Unit {
    println(a + b)
}

// 函数的变长参数可以用 vararg 关键字进行标识
fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}

fun main(args: Array<String>){
    println(sum(1, 1))

    printSum(2, 2)

    vars(1,2,3,4,5)  // 输出12345

    // lambda 表达式
    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    println(sumLambda(1,2))  // 输出 3


}