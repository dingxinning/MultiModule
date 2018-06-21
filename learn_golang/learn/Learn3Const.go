package main

import "fmt"
import "unsafe"

// len(), unsafe.Sizeof()函数计算表达式的值
const (
    aa = "abc"
	bb = len(aa)
	cc = unsafe.Sizeof(aa)
	
)

func main() {
   const LENGTH int = 10
   const WIDTH int = 5   
   var area int
   const a, b, c = 1, false, "str" //多重赋值

   area = LENGTH * WIDTH
   fmt.Printf("面积为 : %d", area)
   println()
   println(a, b, c)   

   println(aa, bb, cc)

   // 在每一个const关键字出现时，被重置为0，然后再下一个const出现之前，每出现一次iota，其所代表的数字会自动增加1
   const (
	aaa = iota   //0
	bbb          //1
	ccc          //2
	ddd = "ha"   //独立值，iota += 1
	eee          //"ha"   iota += 1
	fff = 100    //iota +=1
	ggg          //100  iota +=1
	hhh = iota   //7,恢复计数
	iii          //8
)
fmt.Println(aaa,bbb,ccc,ddd,eee,fff,ggg,hhh,iii)
}