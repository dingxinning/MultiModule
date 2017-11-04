package learn

/**
 * Created by Wuxiang on 2017/1/26.
 * Groovy的类特性
 (1) 不需要public修饰符
 (2) 不需要类型说明
 (3) 不需要getter/setter方法
 (4) 不需要构造函数
 (5) 不需要return
 (6) 不需要()号
 */
class Person {
    def name
    def age
    //Groovy 默认返回方法的最后一行的值
    String toString() { //注意方法的类型String，因为我们要覆盖的方法为String类型
        "$name,$age"
    }
}
// 我们可以使用默认构造方法实例化Person类：
def person1 = new Person()
person1.name = 'kk'
person1.age = 20
println person1

// 也可以用groovy的风格做同样的事：
def person2 = new Person(['name': 'gg', 'age': 22])    //[]号可以省略
println person2

//可变长参数
int sum(int ... var) {
    def total = 0
    for (i in var)
        total += i
    return total
}

//我们可以在调用sum时使用任意个数的参数（1个，2个，3个……）：

println sum(1)
println sum(1, 2)
println sum(1, 2, 3)
println sum(1, 2, 9, 10, 55)
