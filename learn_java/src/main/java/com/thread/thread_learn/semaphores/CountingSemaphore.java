package com.thread.thread_learn.semaphores;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 22. 信号量
 *
 * 三、可计数的Semaphore
 *
 * 可以保证接收和发送的信号量一致，不会丢信号
 */
public class CountingSemaphore {
    private int signals = 0;

    public synchronized void take() throws InterruptedException {
        while (this.signals == 0) {
            wait();
        }
        this.signals--;

    }

    public synchronized void release() {
        this.signals++;
        this.notify();
    }
}
