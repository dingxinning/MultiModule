package com.process;

import com.process.entity.Process;
import com.process.utils.ProcessUtil;

import java.util.List;

/**
 * Created by Wuxiang on 2017/4/15.
 * 最短作业优先算法
 *
 * 优点：改善了FCFS的平均周转时间和平均带权周转时间，缩短作业的等待时间，提高系统的吞吐量。
 * 缺点：对长作业非常不利，可能长时间得不到执行，未能依据作业的紧急迫切程度
 *      划分执行的优先级，难以准确估计作业的执行时间，从而影响调度性能
 */
public class SJF {
    private List<Process> processes;

    // 从文件读入模拟进程
    public SJF(String fileString) {
        processes = ProcessUtil.readProcesses(fileString);
    }

    public void execute() {

        int k = 0;        //最短运行时间作业的下标
        int flag = 0;        //优先级设置
        int minTime = 0;  //最短运行时间
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

            //提前设置一个大值
            minTime = Integer.MAX_VALUE;
            //后一个进程的开始时刻是前一个进程的完成时刻
            currentTime = processes.get(k).getFinishingTime();

            for (int j = 0; j < processes.size(); j++) {
                //跳过不满足条件的（已设置优先级的 和 到达时刻要晚于前一个作业的完成时刻的）
                if (processes.get(j).getOrder() != 0 || currentTime - processes.get(j).getArrivalTime() <= 0) {
                    continue;
                }
                //求出最短运行时间 及 该进程的下标
                if (processes.get(j).getServiceTime() < minTime) {
                    minTime = processes.get(j).getServiceTime();
                    k = j;
                }
            }
        }

        ProcessUtil.sortByOrder(processes);
        ProcessUtil.printTurnTime(processes);
    }

}
