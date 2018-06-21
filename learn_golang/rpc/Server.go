package main

import (
	"../core"
	"net/http"
	"encoding/json"
	"io"
	"log"
)

var blockChain *core.BlockChain

// 创建一个简易的区块链，使用 http 调用
// 访问 http://localhost:8888/block/read
// 访问 http://localhost:8888/block/write?data=1
// 访问 http://localhost:8888/block/write?data=2
// 访问 http://localhost:8888/block/read
func main()  {
	blockChain = core.NewBlockChain()
	run()
}

func run()  {
	http.HandleFunc("/block/read",blockReadHandler)
	http.HandleFunc("/block/write",blockWriteHandler)
	http.ListenAndServe("localhost:8888",nil)
}

func blockReadHandler(w http.ResponseWriter, r *http.Request)  {

	// todo 区块链中数据已经正确，序列化json时出问题，导致前端无数据显示
	blockChain.Print()
	bytes, errors :=  json.Marshal(blockChain)

	if errors!=nil {
		http.Error(w, errors.Error(), http.StatusInternalServerError)
		return
	}

	log.Printf(string(bytes))
	io.WriteString(w, string(bytes))
}

func blockWriteHandler(w http.ResponseWriter, r *http.Request)  {
	blockData := r.URL.Query().Get("data")
	blockChain.SendData(blockData)
	blockReadHandler(w, r)
}
