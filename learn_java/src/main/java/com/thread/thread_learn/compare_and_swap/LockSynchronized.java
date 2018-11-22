package com.thread.thread_learn.compare_and_swap;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 25. CAS（Compare and swap）
 *
 * 使用 synchronized关键字 构成一个原子块
 */
public class LockSynchronized {
    private boolean locked = false;

    public synchronized boolean lock() {
        if (!locked) {
            locked = true;
            return true;
        }
        return false;
    }
}
