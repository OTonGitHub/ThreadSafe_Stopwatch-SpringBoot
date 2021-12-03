/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wk1;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author emran
 */
public class TimerExample {
    public static void main(String[] args) {
        new Thread(new logic()).start();
        
        Timer t = new Timer();
        
        t.scheduleAtFixedRate(new logic(), 100, 1000);
        
    }
}

class logic extends TimerTask {

    @Override
    public void run() {
       
            
            System.out.println("hello");
        
    }
    
    
}