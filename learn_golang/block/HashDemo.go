package main

import (
	"crypto/sha256"
	"encoding/hex"
	"log"
)

func calcHash( string string ) string  {

	hashBytes := sha256.Sum256( []byte (string))

	hashString := hex.EncodeToString(hashBytes[:])

	log.Printf("%s %s", string, hashString)

	return hashString
}

func main()  {

	calcHash("test")
	calcHash("test")
	calcHash("1111")
}