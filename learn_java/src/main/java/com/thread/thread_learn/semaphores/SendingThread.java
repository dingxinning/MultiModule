package com.thread.thread_learn.semaphores;

/**
 * Created by Wuxiang on 2018/3/7
 */
public class SendingThread extends Thread {
//    private Semaphore semaphore;
    private BoundedSemaphore semaphore;

    private int sendingCount = 0;

    SendingThread(BoundedSemaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sendingCount++;
                this.semaphore.release();
                System.out.println("Sending 线程数：" + sendingCount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
