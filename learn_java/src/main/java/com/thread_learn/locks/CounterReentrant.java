package com.thread_learn.locks;

/**
 * Created by Wuxiang on 2018/3/5
 *
 * 可重入：
 * 如果一个java线程进入了代码中的synchronized同步块，
 * 并因此获得了该同步块使用的同步对象对应的管程上的锁，
 * 那么这个线程可以进入由同一个管程对象所同步的另一个java代码块
 */
public class CounterReentrant {

    // 如果是普通的Lock，执行到 inner()的 lock.lock(); 就会被阻塞，因为 this 已经被 outer() 锁住了
//    private Lock lock = new Lock();

    // 但是可重入锁则不会被阻塞
    private ReentrantLock lock = new ReentrantLock();

    public void outer() throws InterruptedException {
        lock.lock();
        inner();
        lock.unlock();
    }

    public synchronized void inner() throws InterruptedException {
        lock.lock();

        try {
            // 临界区做关键的部分代码，可能会引发异常
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // 在finally语句解锁，这样可以保证这个锁对象可以被解锁以便其它线程能继续对其加锁。
            lock.unlock();
        }
    }
}
