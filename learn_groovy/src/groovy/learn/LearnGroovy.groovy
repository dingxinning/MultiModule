package learn

/**
 * Created by Wuxiang on 2017/1/26.
 */
class LearnGroovy {

    static void main(args) {
        println "Hello World!!!";

        //groovy中所有的变量都是对象,不要求强制类型声明
        def string = "test code"
//        def string='test code'
        println("%  " + string + "  %")
        println "(((  " + string + "  )))"
        println(string.class)

        //3个引号  把一个字符串写在多行里
        def var2 = """hello
world
,shanghai"""
        println(var2)

        //一个变量的类型在运行中随时可以改变
        def var = "hello" + " world" + ",shanghai"
        println("begin:" + var + "  " + var.class)
        var = 100
        println("changed:" + var + "  " + var.class)

        // Elvis操作符  （三目运算符 " ? : "）
        // def name="yxrswx"
        def name
        String displayName1 = name != null ? name : "Unknown";
        String displayName2 = name ? name : "Unknown";
        String displayName3 = name ?: "Unknown"
        println displayName1 + " " + displayName2 + " " + displayName3

    }
}
