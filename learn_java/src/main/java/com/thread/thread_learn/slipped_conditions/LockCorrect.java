package com.thread.thread_learn.slipped_conditions;

/**
 * Created by Wuxiang on 2018/3/5
 *
 * 18. 不稳定的条件 Slipped Conditions
 *
 * Lock实现：解决了不稳定的条件
 */
public class LockCorrect {
    private boolean isLocked = true;

    public void lock() {

        // 将检查和设置isLocked条件 放在同一个同步块中原子地执行
        synchronized (this) {
            while (isLocked) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    //do nothing, keep waiting
                }
            }
            isLocked = true;
        }
    }

    public synchronized void unlock() {
        isLocked = false;
        this.notify();
    }
}
