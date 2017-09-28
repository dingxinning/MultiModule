package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Wuxiang on 2017/9/28.
 * 3. ReentrantLock  可重入的互斥锁
 */
public class MyReentrantLock extends Thread {
    TestReentrantLock lock;
    private int id;

    public MyReentrantLock(int i, TestReentrantLock test) {
        this.id = i;
        this.lock = test;
    }

    public void run() {
        lock.print(id);
    }

    public static void main(String args[]) {
        ExecutorService service = Executors.newCachedThreadPool();
        TestReentrantLock lock = new TestReentrantLock();
        for (int i = 0; i < 10; i++) {
            service.submit(new MyReentrantLock(i, lock));
        }
        service.shutdown();
    }
}


