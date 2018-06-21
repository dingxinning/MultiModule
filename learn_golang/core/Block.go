package core

import (
	"encoding/hex"
	"crypto/sha256"
	"time"
)

type Block struct {
	index            int64  // 区块编号
	timestamp        int64  // 区块时间戳
	preBlockHash     string // 上一个区块哈希值
	currentBlockHash string // 当前区块哈希值
	data             string // 区块数据
}

func calculateHash(b Block) string {
	blockData := string(b.index) + string(b.timestamp) + b.preBlockHash + b.data
	hashBytes := sha256.Sum256([]byte (blockData))
	return hex.EncodeToString(hashBytes[:])
}

func generateNewBlock(preBlock Block, data string) Block {
	newBlock := Block{}
	newBlock.index = preBlock.index + 1
	newBlock.preBlockHash = preBlock.currentBlockHash
	newBlock.timestamp = time.Now().Unix()
	newBlock.data = data
	newBlock.currentBlockHash = calculateHash(newBlock)
	return newBlock
}

// 创建 创世区块
func generateGensisBlock() Block {
	preBlock := Block{}
	preBlock.index = -1
	preBlock.currentBlockHash = ""
	preBlock.timestamp = time.Now().Unix()
	return generateNewBlock(preBlock, "GensisBlock")
}
