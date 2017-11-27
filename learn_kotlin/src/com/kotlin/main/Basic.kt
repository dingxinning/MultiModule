package com.kotlin.main

/**
 * Created by Wuxiang on 2017/11/27.
 */

fun main(args: Array<String>){
    // 1. 函数定义
    // 写法1
    //fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
    //    return a + b
    //}

    // 写法2
    //fun sum(a: Int, b: Int) = a + b  // 表达式作为函数体，返回类型自动推断

    // 写法3
    fun sum(a: Int, b: Int): Int = a + b   // public 方法则必须明确写出返回类型

    println(sum(1, 1))

    // 无返回值的函数（Unit类似于java 的void）
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }
    printSum(2, 2)


    // 函数的变长参数可以用 vararg 关键字进行标识
    fun vars(vararg v:Int){
        for(vt in v){
            print("${vt}  ")
        }
    }
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


    // 5. 条件表达式
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }
    println("2与6中较大的是 ${maxOf(2, 6)}")


    // 6. NULL检查机制
    /**
     * 有两种处理方式，字段后加!!像Java一样抛出空异常，
     * 另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理
     */
    //类型后面加?表示可为空
    var age: String? = null
//    val ages = age!!.toInt()      //抛出空指针异常
    val ages1 = age?.toInt()        //不做处理返回 null
    val ages2 = age?.toInt() ?: -1  //age为空返回-1
    println("$ages1  $ages2")


    // 7. 类型检测
    // 使用 is 运算符检测一个表达式是否某类型的一个实例(类似于Java中的instanceof关键字)。
    fun getStringLength(obj: Any): Int? {
        if (obj !is String)
            return null
        // 在这个分支中, `obj` 的类型会被自动转换为 `String`
        return obj.length
    }
    println("${getStringLength("123444")} , ${getStringLength(12)}")


    // 8. 循环
    // 8.1 for循环
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        print("${item}  ")
    }
    println()
    for (index in items.indices) {
        print("item at $index is ${items[index]}  ")
    }
    println()

    // 8.2 while 循环
    var index = 0
    while (index < items.size) {
        print("item at $index is ${items[index]}  ")
        index++
    }
    println()

    // 8.3 when  类似与switch
    fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }
    println("${describe(1)}, ${describe("Hello")}")


    // 9. 区间
    for (i in 1..4) print("${i} ") // 输出“1234”
    for (i in 4..1) print("${i} ") // 什么都不输出
    print("### ")

    // 使用 step 指定步长
    for (i in 1..4 step 2) print("${i} ") // 输出“13”
    for (i in 4 downTo 1 step 2) print("${i} ") // 输出“42”
    print("### ")

    // 使用 until 函数排除结束元素
    for (i in 1 until 5) {   // i in [1, 5) 排除了 5
        print("${i} ")
    }
    println()


    // 10 集合
    // in  判断一个元素是否在集合中
    val sets = setOf("apple", "banana", "kiwi")
    when {
        "orange" in sets -> println("juicy")
        "apple" in sets -> println("apple is fine too")
    }

    // stream 写法
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

}