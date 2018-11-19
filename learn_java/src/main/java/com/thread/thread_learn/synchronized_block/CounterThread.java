package com.thread.thread_learn.synchronized_block;

/**
 * Created by Wuxiang on 2018/3/3
 */
public class CounterThread extends Thread {

    protected Counter counter = null;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    public void run() {
        System.out.println("当前线程：" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            counter.add(1);
            System.out.println(counter.count);
        }
    }
}
