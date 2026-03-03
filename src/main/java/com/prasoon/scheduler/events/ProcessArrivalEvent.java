package com.prasoon.scheduler.events;

import com.prasoon.scheduler.core.Process;
import com.prasoon.scheduler.core.Scheduler;
import com.prasoon.scheduler.simulation.SimulationEngine;

public class ProcessArrivalEvent extends Event {

    private final Process process;
    private final Scheduler scheduler;

    public ProcessArrivalEvent(int time,
                               SimulationEngine engine,
                               Process process,
                               Scheduler scheduler) {
        super(time, engine);
        this.process = process;
        this.scheduler = scheduler;
    }

    @Override
    public void process() {
        System.out.println("Time " + time + ": Process " + process + " arrived.");

        scheduler.addProcess(process);

        Process next = scheduler.getNextProcess(time);

        if (next != null) {
            int completionTime = time + next.getRemainingTime();
            engine.scheduleEvent(
                    new ProcessCompletionEvent(
                            completionTime,
                            engine,
                            next,
                            scheduler
                    )
            );
        }
    }
}