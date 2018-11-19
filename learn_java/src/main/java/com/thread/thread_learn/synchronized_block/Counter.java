package com.thread.thread_learn.synchronized_block;

/**
 * Created by Wuxiang on 2018/3/3
 *
 * add()方法添加 synchronized 同步块
 *
 * 代表同一时间只能有一个线程访问该方法
 */
public class Counter {
    long count = 0;

    public synchronized void add(long value){
        this.count += value;
    }
}
