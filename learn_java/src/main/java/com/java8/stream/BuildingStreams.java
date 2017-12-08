package com.java8.stream;

import java.util.*;
import java.util.function.IntSupplier;
import java.util.stream.*;
import java.nio.charset.Charset;
import java.nio.file.*;

/**
 * Created by Wuxiang on 2017/12/8.
 * Java8 In Action 第五章 使用Stream
 * 5.7 构建流
 */
public class BuildingStreams {
    public static void main(String[] args) throws Exception {

        // Stream.of  通过显式值构建流
        Stream<String> stream = Stream.of("Java 8", "Lambdas", "In", "Action");
        stream.map(String::toUpperCase).forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // Stream.empty  获得空流
        Stream<String> emptyStream = Stream.empty();

        // Arrays.stream 由数组构建流
        int[] numbers = {2, 3, 5, 7, 11, 13};
        System.out.println(Arrays.stream(numbers).sum());

        // Stream.iterate  函数生成流，创建无限流
        // 1. 生成 一个所有正偶数的流
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // 2. 生成 斐波那契数列
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ")"));

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .map(t -> t[0])
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // Stream.generate  生成
        // 0~1的随机数  无限流
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        // 函数式接口  ，全是 1 的无限流
        IntStream.generate(() -> 1)
                .limit(10)
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // 实现  IntSupplier  ，全是 2 的无限流
        IntStream.generate(new IntSupplier() {
            public int getAsInt() {
                return 2;
            }
        })
                .limit(10)
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // 实现 IntSupplier ，构建斐波那契数列 无限流
        IntSupplier fib = new IntSupplier() {
            private int previous = 0;
            private int current = 1;

            public int getAsInt() {
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return this.previous;
            }
        };
        IntStream.generate(fib)
                .limit(20)
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // 从文件生成流
//        long uniqueWords = Files.lines(Paths.get("data.txt"), Charset.defaultCharset())
//                .flatMap(line -> Arrays.stream(line.split(" ")))
//                .distinct()
//                .count();
//
//        System.out.println("There are " + uniqueWords + " unique words in data.txt");
    }
}
