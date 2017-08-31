package com.process;

import com.process.entity.Process;
import com.process.utils.ProcessUtil;

import java.util.List;

/**
 * Created by Wuxiang on 2017/4/15.
 * 最高响应比优先算法  （介于FCFS和SJF之间的算法）
 *
 * 同时考虑每个作业的等待时间的长短和估计需要的执行的时间长短，从而选出响应比最高的作业投入执行
 *
 * 响应比 = 1 + （ 作业等待时间 / 作业处理的时间）
 */
public class HRN {
    private List<Process> processes;

    public HRN(String fileString){
        processes = ProcessUtil.readProcesses(fileString);
    }

    public void execute(){

        int k = 0;        //最最高响应比进程的下标
        int flag = 0;        //优先级设置
        int maxRatio;        //最大响应比的值
        int currentTime;     //当前时刻

        currentTime = processes.get(0).getArrivalTime();

        //先求出最先到达作业的时刻
        for (int i = 0; i < processes.size(); i++) {
            if (processes.get(i).getArrivalTime() < currentTime) {
                currentTime = processes.get(i).getArrivalTime();
                k = i;
            }
        }
        ProcessUtil.printfProcess(processes);

        for (int i = 0; i < processes.size(); i++) {
            processes.get(k).setOrder(++flag);  //设置优先级为1，最高优先级
            processes.get(k).setStartingTime(currentTime);
            processes.get(k).setWaitingTime(processes.get(k).getStartingTime() - processes.get(k).getArrivalTime());
            processes.get(k).setFinishingTime(processes.get(k).getStartingTime() + processes.get(k).getServiceTime());
            processes.get(k).setTurnAroundTime(processes.get(k).getFinishingTime() - processes.get(k).getArrivalTime());
            processes.get(k).setWeightedTurnAroundTime((double) processes.get(k).getTurnAroundTime() / processes.get(k).getServiceTime());

            //提前设置小值
            maxRatio = 0;
            //后一个进程的开始时刻是前一个进程的完成时刻
            currentTime = processes.get(k).getFinishingTime();

            for (int j = 0; j < processes.size(); j++) {
                //跳过不满足条件的（已设置优先级的 和 到达时刻要晚于前一个作业的完成时刻的）
                if (processes.get(j).getOrder() != 0 || currentTime - processes.get(j).getArrivalTime() <= 0) {
                    continue;
                }
                //求出 响应比最高的进程的下标
                if ( (1+(currentTime - processes.get(j).getArrivalTime())/processes.get(j).getServiceTime()) > maxRatio) {
                    maxRatio = (1+(currentTime - processes.get(j).getArrivalTime())/processes.get(j).getServiceTime());
                    k = j;
                }
            }
        }

        ProcessUtil.sortByOrder(processes);
        ProcessUtil.printTurnTime(processes);

    }
}
