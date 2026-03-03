package com.prasoon.scheduler.simulation;

import com.prasoon.scheduler.events.Event;

import java.util.PriorityQueue;

public class SimulationEngine {

    private final PriorityQueue<Event> eventQueue = new PriorityQueue<>();
    private int currentTime = 0;

    public void scheduleEvent(Event event) {
        eventQueue.add(event);
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void run() {
        System.out.println("Simulation started...");

        while (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            currentTime = event.getTime();

            System.out.println("Processing event at time: " + currentTime);
            event.process();
        }

        System.out.println("Simulation finished.");
    }
}