package com.thread.thread_learn.synchronized_block;

/**
 * Created by Wuxiang on 2018/3/3
 */
public class Example {
    public static void main(String[] args){

        // 创建了两个线程。他们的构造器引用同一个Counter实例
        Counter counter = new Counter();
        Thread  threadA = new CounterThread(counter);
        Thread  threadB = new CounterThread(counter);

        threadA.start();
        threadB.start();
    }
}
