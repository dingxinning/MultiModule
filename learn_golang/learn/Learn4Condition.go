package main

import "fmt"

func main() {
    /* 局部变量定义 */
   var a int = 100;
   
	 if a < 20 {
		 fmt.Printf("a 小于 20\n" );
	 } else {
		 fmt.Printf("a 不小于 20\n" );
	 }
	 fmt.Printf("a 的值为 : %d\n", a);


	 // select 
	 var c1, c2, c3 chan int
	 var i1, i2 int
	 select {
		case i1 = <-c1:
		   fmt.Printf("received ", i1, " from c1\n")
		case c2 <- i2:
		   fmt.Printf("sent ", i2, " to c2\n")
		case i3, ok := (<-c3):  // same as: i3, ok := <-c3
		   if ok {
			  fmt.Printf("received ", i3, " from c3\n")
		   } else {
			  fmt.Printf("c3 is closed\n")
		   }
		default:
		   fmt.Printf("no communication\n")
	 }    
	 
    
}