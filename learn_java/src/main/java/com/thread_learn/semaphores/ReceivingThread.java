package com.thread_learn.semaphores;

/**
 * Created by Wuxiang on 2018/3/7
 */
public class ReceivingThread extends Thread {
//    private Semaphore semaphore;
    private BoundedSemaphore semaphore;

    private int receivingCount = 0;

    ReceivingThread(BoundedSemaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (true){
            try {
                receivingCount++;
                this.semaphore.take();
                System.out.println("Receiving 线程数：" + receivingCount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
