package com.thread_learn.locks;

/**
 * Created by Wuxiang on 2018/3/5
 */
public class Counter {
    private Lock lock = new Lock();
    private int count = 0;

    public int inc() throws InterruptedException {
        lock.lock();
        int newCount = ++count;
        lock.unlock();
        return newCount;
    }
}
