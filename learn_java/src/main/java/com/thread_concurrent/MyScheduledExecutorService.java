package com.thread_concurrent;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Wuxiang on 2017/9/28.
 * 8.ScheduledExecutorService  可安排在给定的延迟后运行或定期执行的命令。
 *
 * scheduleAtFixedRate 和 scheduleWithFixedDelay 方法创建并执行某些在取消前一直定期运行的任务。
 */
public class MyScheduledExecutorService {
    public static void main(String[] args) {
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        final Runnable beeper = new Runnable() {
            int count = 0;

            public void run() {
                System.out.println(new Date() + " beep " + (++count));
            }
        };

        // 1秒钟后运行，并每隔2秒运行一次
        final ScheduledFuture beeperHandle = scheduler.scheduleAtFixedRate(beeper, 1, 2, SECONDS);
        // 2秒钟后运行，并每次在上次任务运行完后等待5秒后重新运行
        final ScheduledFuture beeperHandle2 = scheduler.scheduleWithFixedDelay(beeper, 2, 5, SECONDS);
        // 30秒后结束关闭任务，并且关闭Scheduler
        scheduler.schedule(new Runnable() {
            public void run() {
                beeperHandle.cancel(true);
                beeperHandle2.cancel(true);
                scheduler.shutdown();
            }
        }, 30, SECONDS);
    }
}
