package com.advancedStopwatch;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static int second = 0;
    static int minute = 0;

    public static void main(String[] args){
        Timer timer = new Timer();

        System.out.println("Version 1.1");

        timer.scheduleAtFixedRate(new SecondsTTaskC(), 999, 1000);
        timer.scheduleAtFixedRate(new MinutesTTaskC(), 59_999, 59_999);
        timer.scheduleAtFixedRate(new DisplayTTaskC(), 1, 999);
    }

    static class SecondsTTaskC extends TimerTask {
        @Override
        public void run() {
            if ((second + 1) == 60) {
                second = 0;
            } else {
                second++;
            }
        }
    }

    static class MinutesTTaskC extends TimerTask{
        @Override
        public void run(){
            minute++;
        }
    }

    static class DisplayTTaskC extends TimerTask{
        @Override
        public void run(){
            System.out.println(minute+":"+second);
        }
    }

}
