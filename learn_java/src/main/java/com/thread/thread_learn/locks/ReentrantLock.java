package com.thread.thread_learn.locks;

/**
 * Created by Wuxiang on 2018/3/5
 *
 * 19. Java中的锁
 *
 * 二、可重入锁
 */
public class ReentrantLock {
    private boolean isLocked = false;
    private Thread lockedBy = null;
    private int lockedCount = 0;

    public synchronized void lock() throws InterruptedException {
        Thread currentThread = Thread.currentThread();

        // 如果已有线程获得锁，并且 当前线程不是被锁住的线程，被 wait()
        // 意味着 一个线程可以被多次加锁
        // 也就意味着 可重入
        while (isLocked && lockedBy != currentThread) {
            wait();
        }
        isLocked = true;
        lockedCount++;   // 记录 线程被加锁的次数
        lockedBy = currentThread;
    }


    public synchronized void unlock() {
        if (Thread.currentThread() == this.lockedBy) {
            lockedCount--;

            // 在unlock()调用没有达到对应lock()调用的次数之前，我们不希望锁被解除
            if (lockedCount == 0) {
                isLocked = false;
                notify();
            }
        }
    }
}
