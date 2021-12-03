/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Wk1;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author emran
 */
public class Lab7wk1TimerTask {
  static int s=0;
  static int m=0;
  
    public static void main(String[] args) {
//        Thread one = new Thread();
//        
//        new Thread(new Seconds()).start();
//        new Thread(new Display()).start();
//        new Thread(new Minutes()).start();
        
        Timer stopwatch = new Timer();
        
        stopwatch.scheduleAtFixedRate(new Seconds(), 999, 999);
        stopwatch.scheduleAtFixedRate(new Display(), 0, 1000);
        stopwatch.scheduleAtFixedRate(new Minutes(), 59999, 59999);
        
//        Scanner in = new Scanner(System.in);
//        
//        in.nextLine();
//        stopWatch();
    }
  
    public static void stopWatch(){
        System.out.println("Stopwatch has been terminated...!");
        System.exit(0);
    }
    
    
  static class Seconds extends TimerTask {

        @Override
        public void run() {
            s++;
            if (s==60) {
                s=0;
            }
            
        }
      
  }
  
  static class Minutes extends TimerTask {

        @Override
        public void run() {
           
                m++;
            }        
      
  }
  
  static class Display extends TimerTask {

        @Override
        public void run() {
                         
                System.out.println(m+":"+s);
               
                
            
            
        }
      
  }
}









