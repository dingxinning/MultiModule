package core

import (
	"log"
	"fmt"
)

type BlockChain struct {
	Blocks []*Block
}

// 只有将方法名首字母大写，该方法才能被包外引用
func NewBlockChain() *BlockChain {
	genesisBlock := generateGensisBlock()
	blockChain := BlockChain{}
	blockChain.appendBlock(&genesisBlock)
	return &blockChain
}

func (bc *BlockChain) SendData(data string) {
	preBlock := bc.Blocks[len(bc.Blocks)-1]
	newBlock := generateNewBlock(*preBlock, data)
	bc.appendBlock(&newBlock)
}

func (bc *BlockChain) appendBlock(newBlock *Block) {

	if len(bc.Blocks) == 0 {
		bc.Blocks = append(bc.Blocks, newBlock)
		return
	}

	if isValid(*newBlock, *bc.Blocks[len(bc.Blocks)-1]) {
		bc.Blocks = append(bc.Blocks, newBlock)
	} else {
		log.Fatal("invalid block!!!")
	}

}

func (bc *BlockChain) Print()  {
	for _,block:=range bc.Blocks{
		fmt.Printf("Index: %d\n", block.index)
		fmt.Printf("Timestamp: %d\n", block.timestamp)
		fmt.Printf("PreBlockHash: %s\n", block.preBlockHash)
		fmt.Printf("CurrentBlockHash: %s\n", block.currentBlockHash)
		fmt.Printf("Data: %s\n", block.data)
		fmt.Println()
	}
}

func isValid(newBlock Block, oldBlock Block) bool {
	if newBlock.index-1 != oldBlock.index {
		return false
	}

	if newBlock.preBlockHash != oldBlock.currentBlockHash {
		return false
	}

	if calculateHash(newBlock) != newBlock.currentBlockHash {
		return false
	}
	return true
}
