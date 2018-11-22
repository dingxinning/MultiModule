package com.thread.thread_learn.semaphores;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 22. 信号量
 *
 * 一、简单的Semaphore实现
 */
public class Semaphore {
    private boolean signal = false;

    // 等待一个信号，当其接收到信号后，标记位signal被清空
    public synchronized void take() throws InterruptedException {
        while (!this.signal) {
            wait();
        }
        this.signal = false;
    }

    // 发出一个被存放在Semaphore内部的信号
    public synchronized void release() {
        this.signal = true;
        this.notify();
    }
}
