package com.thread_learn.nested_monitor_lockout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2018/3/5
 *
 * 17. 嵌套管程锁死
 *
 * 一个比较挫的公平锁实现方式
 */
public class FairLock {
    private boolean isLocked = false;
    private Thread lockingThread = null;
    private List<QueueObject> waitingThreads = new ArrayList<>();

    public void lock() throws InterruptedException {
        QueueObject queueObject = new QueueObject();

        // 外层锁定 this
        synchronized (this) {
            waitingThreads.add(queueObject);

            while (isLocked || waitingThreads.get(0) != queueObject) {

                // 内层锁定 局部变量queueObject
                synchronized (queueObject) {
                    try {
                        queueObject.wait();
                    } catch (InterruptedException e) {
                        waitingThreads.remove(queueObject);
                        throw e;
                    }
                }
            }
            waitingThreads.remove(queueObject);
            isLocked = true;
            lockingThread = Thread.currentThread();
        }
    }

    // unlock方法被声明成了synchronized，这就相当于一个synchronized（this）块
    public synchronized void unlock() {
        if (this.lockingThread != Thread.currentThread()) {
            throw new IllegalMonitorStateException("Calling thread has not locked this lock");
        }
        isLocked = false;
        lockingThread = null;
        if (waitingThreads.size() > 0) {
            QueueObject queueObject = waitingThreads.get(0);
            synchronized (queueObject) {
                queueObject.notify();
            }
        }
    }
}
