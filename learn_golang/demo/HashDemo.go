package main

import (
	"crypto/sha256"
	"encoding/hex"
	"log"
)

func calcHash(string string) string {
	hashBytes := sha256.Sum256([]byte (string))
	hashString := hex.EncodeToString(hashBytes[:])
	log.Printf("%s %s", string, hashString)
	return hashString
}

// 测试 Go语言进行 SHA256加密
func main() {

	calcHash("test")
	calcHash("test")
	calcHash("1111")
}
