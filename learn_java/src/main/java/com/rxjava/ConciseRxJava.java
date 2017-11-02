package com.rxjava;

import rx.Observable;
import rx.functions.Action1;

/**
 * Created by Wuxiang on 2017/11/2.
 * 简化代码
 */
public class ConciseRxJava {
    public static void main(String[] args) {

        Observable
                .just("Hello, world!")
                .doOnCompleted(()-> System.out.println("OnCompleted!"))
                .doOnError((e)-> System.out.println("onError:" + e))
                .subscribe(System.out::println);

        // 变换
        Observable.just("Hello, world!")
                .subscribe(s -> System.out.println(s + " -Dan"));

        // map操作符
        Observable.just("Hello, world!")
                .map(s -> s + " -Dan")
                .subscribe(s -> System.out.println(s));

        Observable.just("Hello, world!")
                .map(s -> s.hashCode())  // 获取string的哈希值
                .map(i -> Integer.toString(i))//转为string
                .subscribe(s -> System.out.println(s));
    }
}
