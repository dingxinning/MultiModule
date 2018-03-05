package com.thread_learn.slipped_conditions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2018/3/5
 *
 * 18. 不稳定的条件 Slipped Conditions
 *
 * 公平锁的实现：含有不稳定的条件
 */
public class FairLockError {
    private boolean isLocked = false;
    private Thread lockingThread = null;
    private List<QueueObject> waitingThreads = new ArrayList<>();

    public void lock() throws InterruptedException {
        QueueObject queueObject = new QueueObject();

        synchronized (this) {
            waitingThreads.add(queueObject);
        }

        boolean mustWait = true;
        while (mustWait) {

            // 第一个同步块 检查内部变量的值
            synchronized (this) {
                mustWait = isLocked || waitingThreads.get(0) != queueObject;
            }

            // 第二个同步块  检查线程是否需要等待
            synchronized (queueObject) {
                if (mustWait) {
                    try {
                        queueObject.wait();
                    } catch (InterruptedException e) {
                        waitingThreads.remove(queueObject);
                        throw e;
                    }
                }
            }
        }

        // 第三个同步块 只会在mustWait为false的时候执行，将isLocked重新设回true，然后离开lock()方法
        synchronized (this) {
            waitingThreads.remove(queueObject);
            isLocked = true;
            lockingThread = Thread.currentThread();
        }
    }
}
