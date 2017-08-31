package com.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Wuxiang on 2017/8/26.
 *
 * 第一步： 创建要被定执行的任务类
 */
public class MyJob implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(new Date()));
    }
}
