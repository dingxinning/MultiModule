package com.thread_learn.read_write_locks;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wuxiang on 2018/3/6
 *
 * 20. Java中的读写锁
 *
 * 二、可重入的 读/写锁
 */
public class ReadWriteReentrantLock {
    private Map<Thread, Integer> readingThreads = new HashMap<>();

    private int writeAccesses = 0;
    private int writeRequests = 0;
    private Thread writingThread = null;

    public synchronized void lockRead() throws InterruptedException {
        Thread callingThread = Thread.currentThread();
        while (!canGrantReadAccess(callingThread)) {
            wait();
        }

        readingThreads.put(callingThread,
                (getReadAccessCount(callingThread) + 1));
    }

    public synchronized void unlockRead() {
        Thread callingThread = Thread.currentThread();
        if (!isReader(callingThread)) {
            throw new IllegalMonitorStateException("调用线程不会在此ReadWriteLock上保存读锁定");
        }
        int accessCount = getReadAccessCount(callingThread);
        if (accessCount == 1) {
            readingThreads.remove(callingThread);
        } else {
            readingThreads.put(callingThread, (accessCount - 1));
        }
        notifyAll();
    }

    // 读锁重入建立规则：要保证某个线程中的读锁可重入，要么满足获取读锁的条件（没有写或写请求），要么已经持有读锁。
    // 读锁 基本要求：没有写或写请求 （2 和 4）
    // 保证 读锁可重入：一个线程已经持有读锁，允许重入 （3）
    // 保证 写锁降级到读锁 ：对于一个拥有写锁的线程，再获得读锁，是不会有什么危险的 （1）
    private boolean canGrantReadAccess(Thread callingThread) {
        if (isWriter(callingThread)) return true;  // 1
        if (hasWriter()) return false;  // 2
        if (isReader(callingThread)) return true;  // 3
        if (hasWriteRequests()) return false;  // 4
        return true;
    }

    public synchronized void lockWrite() throws InterruptedException {
        writeRequests++;
        Thread callingThread = Thread.currentThread();
        while (!canGrantWriteAccess(callingThread)) {
            wait();
        }
        writeRequests--;
        writeAccesses++;
        writingThread = callingThread;
    }

    public synchronized void unlockWrite() {
        if (!isWriter(Thread.currentThread())) {
            throw new IllegalMonitorStateException("调用线程不会在此ReadWriteLock上保存读锁定");
        }
        writeAccesses--;
        if (writeAccesses == 0) {
            writingThread = null;
        }
        notifyAll();
    }

    // 写锁 基本要求：没有线程持有读锁（2）, 没有线程持有写锁（3）
    // 保证 写锁可重入：仅当一个线程已经持有写锁，才允许写锁重入 （4）
    // 保证 读锁升级到写锁： 要求这个拥有读锁的线程是唯一一个拥有读锁的线程 （1）
    private boolean canGrantWriteAccess(Thread callingThread) {
        if (isOnlyReader(callingThread)) return true; // 1
        if (hasReaders()) return false;  // 2
        if (writingThread == null) return true;  // 3
        if (!isWriter(callingThread)) return false; // 4
        return true;
    }


    private int getReadAccessCount(Thread callingThread) {
        Integer accessCount = readingThreads.get(callingThread);
        if (accessCount == null) return 0;
        return accessCount.intValue();
    }


    private boolean hasReaders() {
        return readingThreads.size() > 0;
    }

    private boolean isReader(Thread callingThread) {
        return readingThreads.get(callingThread) != null;
    }

    private boolean isOnlyReader(Thread callingThread) {
        return readingThreads.size() == 1 && readingThreads.get(callingThread) != null;
    }

    private boolean hasWriter() {
        return writingThread != null;
    }

    private boolean isWriter(Thread callingThread) {
        return writingThread == callingThread;
    }

    private boolean hasWriteRequests() {
        return this.writeRequests > 0;
    }
}
