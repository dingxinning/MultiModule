package com.thread.thread_learn.read_write_locks;

/**
 * Created by Wuxiang on 2018/3/6
 *
 * 20. Java中的读写锁
 *
 * 一、读/写锁
 */
public class ReadWriteLock {
    private int readers = 0;
    private int writers = 0;
    private int writeRequests = 0;

    // 读取
    public synchronized void lockRead() throws InterruptedException {
        // 当没有线程正在做写操作，且没有线程在请求写操作时，可以进行读取
        while (writers > 0 || writeRequests > 0) {
            wait();
        }
        readers++;
    }

    public synchronized void unlockRead() {
        readers--;
        notifyAll();
    }


    // 写入
    public synchronized void lockWrite() throws InterruptedException {
        writeRequests++;

        // 当没有线程正在做读写操作时，才可以写入。
        while (readers > 0 || writers > 0) {
            wait();
        }
        writeRequests--;
        writers++;
    }

    public synchronized void unlockWrite() {
        writers--;
        notifyAll();
    }
}
