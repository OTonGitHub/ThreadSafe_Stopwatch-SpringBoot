package com.stopwatch;

public class MinutesClass extends Thread {
    int minutes = 0;

    public MinutesClass(int startMinute){
        this.minutes = startMinute;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(60_000);
            } catch (Exception iwonthandlethis){}
            this.minutes++;
        }
    }
    public int getValue(){
        return this.minutes;
    }
}
