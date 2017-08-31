package com.process;

import com.process.entity.Process;
import com.process.utils.ProcessUtil;

import java.util.List;

/**
 * Created by Wuxiang on 2017/4/15.
 * 先到先服务调度算法
 *
 * 优点：利于长作业，有利于CPU繁忙的作业
 * 缺点：不利于短作业，不利于I/O繁忙的作业
 */
public class FCFS {
    private List<Process> processes;

    public FCFS(String fileString){
        processes = ProcessUtil.readProcesses(fileString);
    }

    public void execute(){

        //按到达时间排序
        ProcessUtil.sortByArrivalTime(processes);
        ProcessUtil.printfProcess(processes);

        for (int i = 0; i < processes.size(); i++) {
            if (i == 0) {
                //第一个进程的开始时刻 = 该进程的到达时间
                processes.get(i).setStartingTime(processes.get(i).getArrivalTime());
            }else {
                //其余进程的开始时刻 = 前一个作业的完成时刻
                processes.get(i).setStartingTime(processes.get(i-1).getFinishingTime());
            }
            System.out.println("时刻:"+processes.get(i).getStartingTime()+"  进程:"+processes.get(i).getProcessID()+"  启动.");
            processes.get(i).setWaitingTime(processes.get(i).getStartingTime() - processes.get(i).getArrivalTime());
            processes.get(i).setFinishingTime(processes.get(i).getStartingTime() + processes.get(i).getServiceTime());
            processes.get(i).setTurnAroundTime(processes.get(i).getFinishingTime() - processes.get(i).getArrivalTime());
            processes.get(i).setWeightedTurnAroundTime((double) processes.get(i).getTurnAroundTime() / processes.get(i).getServiceTime());
        }

        ProcessUtil.sortByID(processes);
        ProcessUtil.printTurnTime(processes);
    }
}
