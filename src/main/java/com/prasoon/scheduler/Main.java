package com.prasoon.scheduler;

import com.prasoon.scheduler.algorithms.FCFScheduler;
import com.prasoon.scheduler.core.Process;
import com.prasoon.scheduler.core.Scheduler;
import com.prasoon.scheduler.events.ProcessArrivalEvent;
import com.prasoon.scheduler.simulation.SimulationEngine;
import com.prasoon.scheduler.algorithms.SJFScheduler;

public class Main {

    public static void main(String[] args) {

        SimulationEngine engine = new SimulationEngine();
        //Scheduler scheduler = new FCFScheduler();
        Scheduler scheduler = new SJFScheduler();


        // Create processes
        Process p1 = new Process(1, 0, 5);
        Process p2 = new Process(2, 2, 3);
        Process p3 = new Process(3, 4, 2);

        // Schedule arrival events
        engine.scheduleEvent(
                new ProcessArrivalEvent(
                        p1.getArrivalTime(),
                        engine,
                        p1,
                        scheduler
                )
        );

        engine.scheduleEvent(
                new ProcessArrivalEvent(
                        p2.getArrivalTime(),
                        engine,
                        p2,
                        scheduler
                )
        );

        engine.scheduleEvent(
                new ProcessArrivalEvent(
                        p3.getArrivalTime(),
                        engine,
                        p3,
                        scheduler
                )
        );

        // Run simulation
        engine.run();
    }
}