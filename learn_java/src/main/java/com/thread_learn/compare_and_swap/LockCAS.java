package com.thread_learn.compare_and_swap;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 25. CAS（Compare and swap）
 *
 * 使用 AtomicBoolean类 来执行原子操作
 *
 * 较 synchronized 而言，代码运行更快
 */
public class LockCAS {
    private AtomicBoolean locked = new AtomicBoolean(false);

    public boolean lock() {
        return locked.compareAndSet(false, true);
    }
}
