package learn

/**
 * Created by Wuxiang on 2017/1/26.
 * Groovy支持最常见的两个java集合：java.util.Collection和java.util.Map。
 */

//1、定义一个集合
def collect = ["a","b","c"]

//2、给集合增加元素
collect.add(1);
//collect.add(1);  //collect类似list，允许重复的值，不是set
collect << "come on";
collect[collect.size()] = 100.0

//3、集合索引
println collect[collect.size()-1]
println collect
println collect.size()

//4、负索引
println collect[-1]      //索引其倒数第1个元素
println collect[-2]      //索引其倒数第2个元素

//5、集合运算：
collect=collect+5        //在集合中添加元素5
println collect[collect.size()-1]

collect=collect-'a'         //在集合中减去元素a(第1个)
println collect          //现在第1个元素变成b了

//6、往集合中添加另一个集合或删除一个集合：
collect=collect-collect[0..4]   //把集合中的前5个元素去掉
println collect
println collect[0]   //现在集合中仅有一个元素，即原来的最后一个元素
println collect[-1]  //也可以用负索引，证明最后一个元素就是第一个元素


println("##############")


//1、定义一个Map:
def map = ['name':'john','age':14,'sex':'boy']
println map

//2、添加项：
map = map+['weight':25]       //添加john的体重
map.put('length',1.27)      //添加john的身高
map.father='Keller'         //添加john的父亲
println map

//3、两种方式检索值：
println map['father']       //通过key作为下标索引
println map.length          //通过key作为成员名索引