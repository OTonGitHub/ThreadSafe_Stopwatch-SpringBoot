package com.stopwatch;

public class DisplayClass implements Runnable {
    private int min = 0;
    private int sec = 0;

    SecondsClass secondsClass;
    MinutesClass minutesClass;

    public DisplayClass(SecondsClass sC, MinutesClass mC){
        this.secondsClass = sC;
        this.minutesClass = mC;
    }

    public void run() {
        while (true) {
            min = minutesClass.getValue();
            sec = secondsClass.getValue();
            System.out.println(min + ":" + sec);
            try {
                Thread.sleep(1000);
            } catch (Exception ignoredE) {
            }
        }
    }
}
