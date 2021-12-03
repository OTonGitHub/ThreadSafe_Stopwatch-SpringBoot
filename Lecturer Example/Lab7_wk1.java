/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wk1;

/**
 *
 * @author emran
 */
public class Lab7_wk1 {
  static int s=0;
  static int m=0;
  
    public static void main(String[] args) {
        new Thread(new Seconds()).start();
        new Thread(new Display()).start();
        new Thread(new Minutes()).start();
    }
  
  static class Seconds implements Runnable {

        @Override
        public void run() {
            while(true) {
                
                
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e) {}
                s++;
            }
            
        }
      
  }
  
  static class Minutes implements Runnable {

        @Override
        public void run() {
            while(true) {
                
                
                try{
                    Thread.sleep(60*1000);
                }
                catch(Exception e) {}
                m++;
            }
        }
      
  }
  
  static class Display implements Runnable {

        @Override
        public void run() {
            
            while(true) {
                
                System.out.println(m+":"+s);
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e) {}
                
            }
            
        }
      
  }
}









