package learn

/**
 * Created by Wuxiang on 2017/1/26.
 * 循环
 */
def var = "hello "+ "world"+ ",groovy!"

//设置默认参数
def repeat(var,count=3){
    for(i = 0; i < count; i++){
        println(var)
    }
}
def repeat2(var){
    //“0..2”--- “范围”--- 表明包含 整数 0、1、2
    //“0..<2” ----表明包含 整数 0、1
    //“范围”实际也是集合的一种（java.util.List）
    for(i in 0..2){
        //String字符串类型
        println(var)
        //Gstring字符串类型
        println("$i:$var")
    }
}
repeat(var,4)
println("-------------")
repeat2(var)