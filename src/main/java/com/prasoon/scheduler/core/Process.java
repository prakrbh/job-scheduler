package com.prasoon.scheduler.core;

public class Process {

    private final int pid;
    private final int arrivalTime;
    private final int burstTime;

    private int remainingTime;
    private int startTime = -1;
    private int completionTime = -1;

    public Process(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }

    public int getPid() { return pid; }
    public int getArrivalTime() { return arrivalTime; }
    public int getBurstTime() { return burstTime; }
    public int getRemainingTime() { return remainingTime; }
    public int getStartTime() { return startTime; }
    public int getCompletionTime() { return completionTime; }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }

    @Override
    public String toString() {
        return "P" + pid;
    }
}