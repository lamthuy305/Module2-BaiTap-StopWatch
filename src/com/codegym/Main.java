package com.codegym;

public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.getStartTime();
        // Viết 1 chương trình và đo thời gian
        stopWatch.getEndTime();
        long x = stopWatch.getElapsedTime();
        System.out.println(x);
    }
}
