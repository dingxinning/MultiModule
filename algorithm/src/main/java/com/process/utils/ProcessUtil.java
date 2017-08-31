package com.process.utils;

import com.process.entity.Process;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Wuxiang on 2017/4/15.
 */
public class ProcessUtil {

    public static List<Process> readProcesses(String fileString){
        List<Process> processes = new ArrayList<Process>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileString));
            while (scanner.hasNext()) {
                char processID = scanner.next().charAt(0);
                int arrivalTime = scanner.nextInt();
                int serviceTime = scanner.nextInt();
                processes.add(new Process(processID, arrivalTime, serviceTime));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.close();
        return processes;
    }

    public static void sortByServiceTime(List<Process> processes) {
        processes.sort(new Comparator<Process>() {
            public int compare(Process o1, Process o2) {
                if (o1.getServiceTime() > o2.getServiceTime()) {
                    return 1;
                } else if (o1.getServiceTime() == o2.getServiceTime()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

    //根据id排序
    public static void sortByID(List<Process> processes) {
        processes.sort(new Comparator<Process>(){
            @Override
            public int compare(Process o1, Process o2) {
                if (o1.getProcessID()>o2.getProcessID()) {
                    return 1;
                }else if (o1.getProcessID() == o2.getProcessID()) {
                    return 0;
                }else{
                    return -1;
                }
            }

        });
    }

    //按到达时间排序
    public static void sortByArrivalTime(List<Process> processes){
        processes.sort(new Comparator<Process>() {
            @Override
            public int compare(Process o1, Process o2) {
                if (o1.getArrivalTime()>o2.getArrivalTime()) {
                    return 1;
                }else if (o1.getArrivalTime() == o2.getArrivalTime()) {
                    return 0;
                }else{
                    return -1;
                }
            }
        });
    }

    //按优先级排序
    public static void sortByOrder(List<Process> processes){
        processes.sort(new Comparator<Process>() {
            @Override
            public int compare(Process o1, Process o2) {
                if (o1.getOrder()>o2.getOrder()) {
                    return 1;
                }else if (o1.getOrder() == o2.getOrder()) {
                    return 0;
                }else{
                    return -1;
                }
            }
        });
    }

    //打印所有的进程
    public static void printfProcess(List<Process> processes) {
        System.out.println("************************");
        System.out.println("id\t到达时间\t服务时间");
        for (int i = 0; i < processes.size(); i++) {
            System.out.println(processes.get(i).getProcessID()+"\t\t"
                    +processes.get(i).getArrivalTime()+"\t\t"
                    +processes.get(i).getServiceTime()
            );
        }
        System.out.println("************************");
    }

    //打印 结果 和 平均周转时间和带权时间
    public static void printTurnTime(List<Process> processes) {
        System.out.println("--------过程记录----------");
        int tempA = 0;
        double tempB = 0;
        for(Process p : processes){
            System.out.println(p);
            tempA += p.getTurnAroundTime();
            tempB += p.getWeightedTurnAroundTime();
        }
        System.out.println("作业平均周转时间：" + tempA / processes.size());
        System.out.println("作业带权平均周转时间：" + tempB / processes.size());
    }
}
