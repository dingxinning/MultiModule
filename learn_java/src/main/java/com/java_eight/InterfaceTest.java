package com.java_eight;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by yxrsw on 2017/2/14.
 * java 8 新特性
 * 第二个文件
 */
public class InterfaceTest {
    public static void main(String[] args) {

        //八、访问接口的默认方法

        //Predicate接口
        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.print(predicate.test("foo")+"----");              // true
        System.out.println(predicate.negate().test("foo"));     // false  negate()是非
        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        //Function 接口 ???不懂怎么转换的
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        System.out.println("Function::  "+backToString.apply("123").getClass());     // "123"

        //Supplier 接口 返回一个任意范式的值
        Supplier<Person> personSupplier = Person::new;
        System.out.println("Supplier::  "+personSupplier.get());   // 返回new Person

        //Consumer 接口
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.lastName+" "+p.firstName);
        greeter.accept(new Person("Luke", "Skywalker"));

        //Comparator 接口
        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");
        comparator.compare(p1, p2);             // > 0
        comparator.reversed().compare(p1, p2);  // < 0

        //Optional 接口  如果为空，抛异常
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        System.out.println("Optional::  "+optional.get());   // "bam"
        optional.orElse("fallback");    // "bam"
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"

        //Stream 接口
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        //java.util.Stream 表示能应用在一组元素上 一次执行的 操作序列。
        //Stream操作分为中间操作或者最终操作

        /*
         * filter过滤
         * 通过一个predicate接口来过滤并只保留符合条件的元素   属于中间操作
         * foreach遍历执行，是stream的最终操作
         */
        stringCollection.stream()
                .filter(s -> s.startsWith("a"))
                .forEach(s -> System.out.print(s + "---"));
        /*
         * sort排序
         * 返回排序后的stream（不会修改原数据）  属于中间操作
         */
        stringCollection.stream().sorted()
                .filter(s -> s.startsWith("a"))
                .forEach(s -> System.out.print(s + "+++"));
        System.out.println();
        /*
         * Map 映射
         * 根据指定的Function接口来依次将元素转成另外的对象
         */
        stringCollection.stream()
                .map(String::toUpperCase)    //大写
                .sorted((a, b) -> b.compareTo(a))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        /*
         * Match 匹配
         * 允许检测指定的Predicate是否匹配整个Stream
         */
        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch(s -> s.startsWith("a"));  //true
        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch(s -> s.startsWith("a"));  //false
        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch(s -> s.startsWith("z")); //true
        System.out.println(anyStartsWithA+"***"+allStartsWithA+"***"+noneStartsWithZ);
        /*
         * count计数
         * 返回Stream中元素的个数，返回值类型是long。
         * 计数是一个最终操作
         */
        long startsWithB = stringCollection.stream()
                .filter((s) -> s.startsWith("b"))
                .count();
        System.out.println("b开头的元素个数： "+startsWithB);
        /*
         * reduce规约
         * 允许通过指定的函数来讲stream中的多个元素规约为一个元素，规越后的结果是通过Optional接口表示的
         * 规约是一个最终操作
         */
        Optional<String> reduced = stringCollection
                .stream().sorted().reduce((s1, s2) -> s1 + "  #  " + s2);
        reduced.ifPresent(System.out::print);
    }
}
