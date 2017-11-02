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
                .doOnError((throwable)-> System.out.println("onError:" + throwable))
                .subscribe(System.out::println);
    }
}
