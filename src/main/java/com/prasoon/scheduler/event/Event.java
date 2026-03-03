package com.prasoon.scheduler.events;

public abstract class Event implements Comparable<Event> {

    protected final int time;

    public Event(int time) {
        this.time = time;
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