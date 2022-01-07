package com.codegym;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long start() {
        return System.currentTimeMillis();
    }

    public long stop() {

        return System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return stop() - start();
    }
}