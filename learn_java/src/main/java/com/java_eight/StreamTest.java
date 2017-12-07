package com.java_eight;

import com.java_eight.entity.Formula;
import com.java_eight.entity.Person;
import com.java_eight.entity.PersonFactory;
import org.springframework.core.convert.converter.Converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Wuxiang on 2016/12/30.
 * Java 8 新特性
 * 第一个文件
 */
public class StreamTest {
    public static void main(String[] args) {

        //一、接口的默认方法
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100));     // 100.0
        System.out.println(formula.sqrt(16));           // 4.0


        //二、Lambda 表达式
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        names.forEach(s-> System.out.println("排序前："+s));
        //老版本排列
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        //java8 新用法
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        Collections.sort(names, (String a, String b) -> b.compareTo(a));  //或者这样
        Collections.sort(names, Comparator.reverseOrder());  //可以更简洁
        names.sort((a, b) -> b.compareTo(a));  //或者这样
        names.forEach( s -> System.out.println("排序后："+s) );



        //三、函数式接口
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println("========"+converted+"  类型："+converted.getClass());    // 123  将string型的123转换为int型的


        //四、方法与构造函数引用
        //Converter<String, Integer> converter = Integer::valueOf;
        Integer integer = converter.convert("456");
        System.out.println("========"+integer);   // 456

        // :: 关键字来传递方法或者构造函数引用
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");

        //五、Lambda 作用域

        //在lambda表达式中访问外层作用域和老版本的匿名对象中的方式很相似。
        //可以直接访问标记了final的外层局部变量，或者实例的字段以及静态变量。

        //六、访问局部变量
        final int num = 1;  //final 可以隐藏
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);
        System.out.println("访问外层的局部变量："+stringConverter.convert(2));
        System.out.println("类型："+stringConverter.convert(2).getClass()); // string类型的3
        //num=3;   //无论num是否是final，都无法修改值


        //七、访问对象字段与静态变量  ？？？
//        Lambda4 a;
//        a.testScopes();


    }
}
