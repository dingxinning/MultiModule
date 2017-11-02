package com.rxjava;


import rx.Observable;
import rx.Subscriber;

/**
 * Created by Wuxiang on 2017/11/2.
 * RxJava 是什么？
 1. 异步数据处理库
 2. 扩展的观察者模式　（onNext、onCompleted、OnError）
 */
public class RxJava {
    public static void main(String[] args) {
        // 被观察者
        Observable<String> myObservable = Observable.create(
                new Observable.OnSubscribe<String>() {
                    @Override
                    public void call(Subscriber<? super String> sub) {
                        sub.onNext("Hello, world!");
                        sub.onCompleted();
                    }
                }
        );

        // 观察者
        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {
                System.out.println("Receive:" + s);
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted!");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError:" + e);
            }
        };

        //　观察者订阅被观察者
        myObservable.subscribe(mySubscriber);
    }
}
