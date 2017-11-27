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
    println("sum of $a and $b is ${a + b}")
}

// 函数的变长参数可以用 vararg 关键字进行标识
fun vars(vararg v:Int){
    for(vt in v){
        print("${vt}  ")
    }
}

fun main(args: Array<String>){
    println(sum(1, 1))

    printSum(2, 2)

    vars(1,2,3,4,5)  // 输出12345
    println()

    // lambda 表达式
    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    println(sumLambda(1,2))  // 输出 3


    // 2. 定义变量与常量 ps:在使用变量前，必须赋值
    val a = 1      // 常量val 变量var
    val b = 1       // 系统自动推断变量类型为Int
    val c: Int      // 如果不在声明时初始化则必须提供变量类型
    c = 1           // 明确赋值
    var x = 5        // 系统自动推断变量类型为Int
    x += 1           // 变量可修改
    println("${a}, ${b}, ${c}, ${x}")


    // 3.注释
    // 这是一个单行注释
    /* 这是一个多行的
       块注释。 */


    // 4.字符串模版
    var aa = 1
    // 模板中的简单名称：
    val s1 = "a is $aa"

    aa = 2
    // 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $aa"
    println(s2)
}