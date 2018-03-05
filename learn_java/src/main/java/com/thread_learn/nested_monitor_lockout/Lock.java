package com.thread_learn.nested_monitor_lockout;

/**
 * Created by Wuxiang on 2018/3/5
 *
 * 17. 嵌套管程锁死
 *
 * 一个比较挫的Lock实现
 *
 * 总结：在 lock()方法中等待的线程需要其它线程成功调用 unlock()方法来退出 lock()方法，
 * 但是，在 lock()方法离开外层同步块之前，没有线程能成功执行unlock()。
 * 结果就是，任何调用 lock方法或 unlock方法的线程都会一直阻塞。这就是嵌套管程锁死
 */
public class Lock {
    protected MonitorObject monitorObject = new MonitorObject();
    protected boolean isLocked = false;

    public void lock() throws InterruptedException {

        // 外层同步快
        synchronized (this) {
            while (isLocked) {

                // 内层同步快
                synchronized (this.monitorObject) {
                    this.monitorObject.wait();
                }
            }
            isLocked = true;
        }
    }

    public void unlock() {
        synchronized (this) {
            this.isLocked = false;
            synchronized (this.monitorObject) {
                this.monitorObject.notify();
            }
        }
    }
}
