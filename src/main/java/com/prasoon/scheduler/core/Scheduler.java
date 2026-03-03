package com.prasoon.scheduler.core;

public interface Scheduler {

    void addProcess(Process process);

    Process getNextProcess(int currentTime);

    boolean hasProcesses();
}