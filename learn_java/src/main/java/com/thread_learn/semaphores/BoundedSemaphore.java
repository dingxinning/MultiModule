package com.thread_learn.semaphores;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 22. 信号量
 *
 * 四、有上限的Semaphore
 *
 * 在可计数的基础上，可以设置限信号量的上限
 */
public class BoundedSemaphore {
    private int signals = 0;
    private int bound;
    private int signalCount = 0;

    BoundedSemaphore(int upperBound) {
        this.bound = upperBound;
    }

    public synchronized void take() throws InterruptedException {
        while (this.signals == 0) {
            wait();
        }
        this.signals--;
        this.notify();
    }

    public synchronized void release() throws InterruptedException {
        while (this.signalCount == this.bound) {
            wait();
        }
        this.signalCount++;
        this.signals++;
        this.notify();
    }
}
