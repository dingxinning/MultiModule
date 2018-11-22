package com.thread.thread_learn.slipped_conditions;

/**
 * Created by Wuxiang on 2018/3/5
 *
 * 18. 不稳定的条件 Slipped Conditions
 *
 * Lock实现：含有不稳定的条件
 */
public class LockError {
    private boolean isLocked = true;

    public void lock() {

        // 第一个同步块执行wait操作直到isLocked变为false才退出
        synchronized (this) {
            while (isLocked) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    //do nothing, keep waiting
                }
            }
        }

        // 第二个同步块将isLocked置为true,以此来锁住这个Lock实例避免其它线程通过lock()方法
        synchronized (this) {
            isLocked = true;
        }
    }

    public synchronized void unlock() {
        isLocked = false;
        this.notify();
    }
}
