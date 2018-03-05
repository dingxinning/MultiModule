package com.thread_learn.slipped_conditions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2018/3/5
 *
 * 18. 不稳定的条件 Slipped Conditions
 *
 * 公平锁的实现：解决了不稳定的条件，但仍然有可能丢失信号
 */
public class FairLockCorrect {
    private boolean isLocked = false;
    private Thread lockingThread = null;
    private List<QueueObject> waitingThreads = new ArrayList<>();

    public void lock() throws InterruptedException {
        QueueObject queueObject = new QueueObject();

        synchronized (this) {
            waitingThreads.add(queueObject);
        }

        // 将对局部变量mustWait的检查与赋值 放在同一个同步块中完成
        boolean mustWait = true;
        while (mustWait) {

            synchronized (this) {
                mustWait = isLocked || waitingThreads.get(0) != queueObject;
                if (!mustWait) {
                    waitingThreads.remove(queueObject);
                    isLocked = true;
                    lockingThread = Thread.currentThread();
                    return;
                }
            }

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
    }
}
