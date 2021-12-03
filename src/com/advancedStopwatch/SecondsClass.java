//package com.advancedStopwatch;
//
//import java.util.TimerTask;
//
//public class SecondsClass extends TimerTask {
//    public int sec = 0;
//
//    public SecondsClass(int s) {
//        this.sec = s;
//    }
//
//    @Override
//    public void run() {
//        this.sec++;
//        if (this.sec == 60) {
//            this.sec = 0;
//        }
//        System.out.println(this.sec);
//    }
//
//    public int getSec() {
//        return this.sec;
//    }
//}
