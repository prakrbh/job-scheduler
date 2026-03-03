package com.prasoon.scheduler.events;

import com.prasoon.scheduler.simulation.SimulationEngine;

public abstract class Event implements Comparable<Event> {

    protected final int time;
    protected final SimulationEngine engine;

    public Event(int time, SimulationEngine engine) {
        this.time = time;
        this.engine = engine;
    }

    public int getTime() {
        return time;
    }

    public abstract void process();

    @Override
    public int compareTo(Event other) {
        return Integer.compare(this.time, other.time);
    }
}