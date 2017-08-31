package learn

/**
 * Created by Wuxiang on 2017/2/6.
 * 动态性
 * Groovy所有的对象都有一个元类metaClass，
 * 我们可以通过metaClass属性访问该元类。
 * 通过元类，可以为这个对象增加方法
 */
def msg="Hello!"
println msg.metaClass

//为msg增加了一个String 类中所没有的方法up
String.metaClass.up= { delegate.toUpperCase() }
println msg.up()

//检索对象所拥有的方法和属性
//msg.metaClass.methods.each { println it.name }  //可以看到新添加的up方法
//msg.metaClass.properties.each { println it.name }

//判断是否有up方法，并调用
if (msg.metaClass.respondsTo(msg, 'up')) {
    println msg.toUpperCase()
}

//判断是否有bytes的属性
if (msg.metaClass.hasProperty(msg, 'bytes')) {
    println msg.bytes.encodeBase64()
}