package main

import "../core"

// 创建一个简易的区块链，直接调用
func main() {

	// 生成创世区块
	bc := core.NewBlockChain()

	bc.SendData("data 1")
	bc.SendData("data 2")

	bc.Print()
}
