package com.thread_learn.starvation_fairness;

/**
 * Created by Wuxiang on 2018/3/4
 *
 * 16. 饥饿与公平
 *
 * 锁的实现
 *
 * notify()  会从 所有等待线程中随机选择一个进行唤醒，具有随机性
 */
public class Lock {
    private boolean isLocked = false;  // 是否有锁， 当为true时，代表对象已锁，当为false时，代表对象没锁
    private Thread lockingThread = null;

    public synchronized void lock() throws InterruptedException {
        // 如果已经加锁，陷入循环，线程处于等待状态
        while (isLocked) {
            wait();
        }
        // 某一个线程被唤醒，加锁，成为当前线程，
        isLocked = true;
        lockingThread = Thread.currentThread();
    }

    public synchronized void unlock() {
        if (this.lockingThread != Thread.currentThread()) {
            throw new IllegalMonitorStateException("调用线程尚未锁定此锁");
        }
        // 解锁，当前线程清空
        isLocked = false;
        lockingThread = null;
        notify();  // 唤醒某个等待的线程
    }
}
