package com.thread.thread_learn.semaphores;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 22. 信号量
 *
 * 四、有上限的Semaphore
 *
 * 在可计数的基础上，可以设置限信号量的上限
 *
 * 当信号量的数量上限是1时，Semaphore可以被当做锁来使用。
 */
public class BoundedSemaphore {
    private int signals = 0;
    private int bound;

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

        // this.bound 是当前信号量的上限，this.signals是当前的信号量的数目，没毛病
        while (this.signals == this.bound) {
            wait();
        }
        this.signals++;
        this.notify();
    }
}
