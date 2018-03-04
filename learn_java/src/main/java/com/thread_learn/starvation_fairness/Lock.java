package com.thread_learn.starvation_fairness;

/**
 * Created by Wuxiang on 2018/3/4
 *
 * 16. 饥饿与公平
 *
 * 锁的实现
 */
public class Lock {
    private boolean isLocked = false;
    private Thread lockingThread = null;

    public synchronized void lock() throws InterruptedException {
        while (isLocked) {
            wait();
        }
        isLocked = true;
        lockingThread = Thread.currentThread();
    }

    public synchronized void unlock() {
        if (this.lockingThread != Thread.currentThread()) {
            throw new IllegalMonitorStateException("调用线程尚未锁定此锁");
        }
        isLocked = false;
        lockingThread = null;
        notify();
    }
}
