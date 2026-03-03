package com.prasoon.scheduler.events;

import com.prasoon.scheduler.core.Process;
import com.prasoon.scheduler.core.Scheduler;
import com.prasoon.scheduler.simulation.SimulationEngine;

public class ProcessCompletionEvent extends Event {

    private final Process process;
    private final Scheduler scheduler;

    public ProcessCompletionEvent(int time,
                                  SimulationEngine engine,
                                  Process process,
                                  Scheduler scheduler) {
        super(time, engine);
        this.process = process;
        this.scheduler = scheduler;
    }

    @Override
    public void process() {
        process.setCompletionTime(time);

        System.out.println("Time " + time + ": Process " + process + " completed.");
    }
}