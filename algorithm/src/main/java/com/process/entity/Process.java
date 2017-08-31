package com.process.entity;

/**
 * Created by Wuxiang on 2017/4/15.
 */
public class Process {
    private char processID;    //进程id
    private int arrivalTime;   //到达时间
    private int serviceTime;   //服务时间

    private int waitingTime;  //等待时间
    private int startingTime; //开始时间
    private int finishingTime; //完成时间
    private int turnAroundTime; //周转时间
    private double weightedTurnAroundTime;  //带权周转时间
    private int order; //优先级

    public Process(char processID, int arrivalTime, int serviceTime) {
        super();
        this.processID = processID;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
    }

    public char getProcessID() {
        return processID;
    }

    public void setProcessID(char processID) {
        this.processID = processID;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public int getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(int startingTime) {
        this.startingTime = startingTime;
    }

    public int getFinishingTime() {
        return finishingTime;
    }

    public void setFinishingTime(int finishingTime) {
        this.finishingTime = finishingTime;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

    public double getWeightedTurnAroundTime() {
        return weightedTurnAroundTime;
    }

    public void setWeightedTurnAroundTime(double weightedTurnAroundTime) {
        this.weightedTurnAroundTime = weightedTurnAroundTime;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    @Override
    public String toString() {
        return "Process{" +
                "processID=" + processID +
                ", arrivalTime=" + arrivalTime +
                ", serviceTime=" + serviceTime +
                ", waitingTime=" + waitingTime +
                ", startingTime=" + startingTime +
                ", finishingTime=" + finishingTime +
                ", turnAroundTime=" + turnAroundTime +
                ", weightedTurnAroundTime=" + weightedTurnAroundTime +
                ", order=" + order +
                '}';
    }
}
