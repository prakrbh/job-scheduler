package com.prasoon.scheduler.algorithms;

import com.prasoon.scheduler.core.Process;
import com.prasoon.scheduler.core.Scheduler;

import java.util.LinkedList;
import java.util.Queue;

public class FCFScheduler implements Scheduler {

    private final Queue<Process> readyQueue = new LinkedList<>();

    @Override
    public void addProcess(Process process) {
        readyQueue.add(process);
    }

    @Override
    public Process getNextProcess(int currentTime) {
        return readyQueue.poll();
    }

    @Override
    public boolean hasProcesses() {
        return !readyQueue.isEmpty();
    }
}