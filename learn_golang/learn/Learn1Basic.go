package main

import "fmt"

func main() {
	// 在 Go 程序中，一行代表一个语句结束。
	fmt.Println("Hello, World!")
	fmt.Println("w3cschool")

	// 将多个语句写在同一行，它们则必须使用 ; 人为区分
	fmt.Println("1"); fmt.Println("2");

	// 单行注释
	/*
	Author by w3cschool菜鸟教程
	我是多行注释
	*/

	// Go 语言中变量的声明必须使用空格隔开
	var age int;
	age = 12;
	fmt.Println("age:", age)
    
}