package com.thread_learn.starvation_fairness;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2018/3/4
 *
 * 16. 饥饿和公平
 *
 * 公平锁的实现
 */
public class FairLock {
    private boolean isLocked = false;
    private Thread lockingThread = null;
    private List<QueueObject> waitingThreads = new ArrayList<>();

    public void lock() throws InterruptedException {
        QueueObject queueObject = new QueueObject();
        boolean isLockedForThisThread = true;
        synchronized (this) {
            waitingThreads.add(queueObject);
        }

        while (isLockedForThisThread) {
            synchronized (this) {
                isLockedForThisThread =
                        isLocked || waitingThreads.get(0) != queueObject;
                if (!isLockedForThisThread) {
                    isLocked = true;
                    waitingThreads.remove(queueObject);
                    lockingThread = Thread.currentThread();
                    return;
                }
            }
            // queueObject.doWait()调用放置在synchronized(this)块之外，以避免被循环嵌套器锁死
            try {
                queueObject.doWait();
            } catch (InterruptedException e) {
                synchronized (this) {
                    waitingThreads.remove(queueObject);
                }
                throw e;
            }
        }
    }

    public synchronized void unlock() {
        if (this.lockingThread != Thread.currentThread()) {
            throw new IllegalMonitorStateException("调用线程尚未锁定此锁");
        }
        isLocked = false;
        lockingThread = null;

        // 从队列头部获取QueueObject，并对其调用doNotify()，以唤醒在该对象上等待的线程。
        if (waitingThreads.size() > 0) {
            waitingThreads.get(0).doNotify();
        }
    }
}
