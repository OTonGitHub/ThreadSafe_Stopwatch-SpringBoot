package com.stopwatch;

public class SecondsClass extends Thread {
    int seconds = 0;

    public SecondsClass(int startSecond){
        this.seconds = startSecond;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            } catch (Exception unhandled){}
            if((this.seconds + 1) == 60){
                this.seconds = 0;
            }else {
                this.seconds++;
            }
        }
    }
    public int getValue(){
        return this.seconds;
    }
}
