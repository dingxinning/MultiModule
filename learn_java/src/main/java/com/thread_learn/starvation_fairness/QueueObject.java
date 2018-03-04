package com.thread_learn.starvation_fairness;

/**
 * Created by Wuxiang on 2018/3/4
 */
public class QueueObject {
    private boolean isNotified = false;

    public synchronized void doWait() throws InterruptedException {
        while(!isNotified){
            this.wait();
        }
        this.isNotified = false;
    }

    public synchronized void doNotify() {
        this.isNotified = true;
        this.notify();
    }

    public boolean equals(Object o) {
        return this == o;
    }
}
