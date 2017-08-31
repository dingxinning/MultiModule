package learn

/**
 * Created by Wuxiang on 2017/1/26.
 * 闭包
 */
def map = ['name':'john','age':14,'sex':'boy']
map.each(
        {key,value->     // key,value两个参数用于接受每个元素的键/值
            println "$key:$value"})

map.each{println it}     //it是一个关键字，代表map集合的每个元素
map.each({ println it.getKey()+"-->"+it.getValue()})

//除了用于迭代之外，闭包也可以单独定义,例如定义一个必包：

def say={word->
    println "Hi,$word!"
}

//调用：
say('groovy')
say.call('groovy&grails')   //call是必包的方法