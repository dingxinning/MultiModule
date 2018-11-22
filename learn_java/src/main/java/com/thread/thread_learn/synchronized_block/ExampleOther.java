package com.thread.thread_learn.synchronized_block;

/**
 * Created by Wuxiang on 2018/3/3
 */
public class ExampleOther {
    public static void main(String[] args) {

        // 两个线程引用了两个不同的Counter实例，那么他们可以同时调用add()方法。
        Counter counterA = new Counter();
        Counter counterB = new Counter();
        Thread  threadA = new CounterThread(counterA);
        Thread  threadB = new CounterThread(counterB);

        threadA.start();
        threadB.start();
    }
}
