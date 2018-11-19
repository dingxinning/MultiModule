package com.thread.thread_learn.starvation_fairness;

/**
 * Created by Wuxiang on 2018/3/4
 *
 * 16. 饥饿与公平
 *
 * 2. 在Java中实现公平性
 * 2.1 使用锁方式替代同步块
 * 2.2 公平锁
 */
public class Synchronizer {

    private Lock lock = new Lock();

    public void doSynchronized1() throws InterruptedException{
        this.lock.lock();

        // 关键部分，需要很长时间来做的工作

        this.lock.unlock();
    }

    private FairLock fairLock = new FairLock();

    public void doSynchronized2() throws InterruptedException{
        this.fairLock.lock();

        // 关键部分，需要很长时间来做的工作

        this.fairLock.unlock();
    }
}
