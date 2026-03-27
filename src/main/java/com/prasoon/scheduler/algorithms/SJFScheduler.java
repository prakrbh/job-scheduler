package com.prasoon.scheduler.algorithms;

import com.prasoon.scheduler.core.Process;
import com.prasoon.scheduler.core.Scheduler;

import java.util.PriorityQueue;

public class SJFScheduler implements Scheduler {

    //private final PriorityQueue<Process> pq = new PriorityQueue<>((a, b) -> a.getBurstTime() - b.getBurstTime());
    private final PriorityQueue<Process> pq =
            new PriorityQueue<>(java.util.Comparator.comparingInt(Process::getBurstTime));
    @Override
    public void addProcess(Process process) {
        pq.add(process);
    }

    @Override
    public Process getNextProcess(int currentTime) {
        return pq.poll();
    }

    @Override
    public boolean hasProcesses() {
        return !pq.isEmpty();
    }
}
