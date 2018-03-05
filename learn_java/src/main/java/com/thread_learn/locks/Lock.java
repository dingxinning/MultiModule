package com.thread_learn.locks;

/**
 * Created by Wuxiang on 2018/3/5
 *
 * 19. Java中的锁
 *
 * 一、一个简单的锁
 */
public class Lock {

    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {

        // 自旋锁
        while (isLocked) {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify();
    }
}
