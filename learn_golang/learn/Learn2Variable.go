package main

import "fmt"

var x, y int
var (  // 这种因式分解关键字的写法一般用于声明全局变量
    a int
    b bool
)

var c, d int = 1, 2
var e, f = 123, "hello"

// 声明全局变量，不使用 没有问题
var test string = "123";

func main(){
	// 变量声明
	// 根据值自行判定变量类型
	var aa = "菜鸟教程"
	// 指定变量类型，并赋值
	var bb string = "runoob.com"
	// 指定变量类型，声明后若不赋值，使用默认值。
	var cc bool
	// 省略var, 注意 :=左侧的变量应该是没有声明过的
	dd := 5

	fmt.Println(aa,bb,cc,dd)

	// 多变量声明

	//这种不带声明格式的只能在函数体中出现
	g, h := 123, "hello"
	println(x, y, a, b, c, d, e, f, g, h)

	// 声明了一个局部变量却没有在相同的代码块中使用它
	// 编译报错： test declared and not used
	// var test string = "123";

	fmt.Println(c,d);
	c,d=d,c;
	fmt.Println("交换变量：",c,d);
}