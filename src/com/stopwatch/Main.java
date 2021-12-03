package com.stopwatch;

import java.util.Objects;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

//        new Thread(new SecondsClass(0)).start();
//        new Thread(new MinutesClass(0)).start();

        SecondsClass secondC = new SecondsClass(0);
        MinutesClass minutesC = new MinutesClass(0);
        Thread display = new Thread(new DisplayClass(secondC, minutesC));

        secondC.start();
        minutesC.start();
        display.start();

        Scanner in = new Scanner(System.in);
        in.nextLine();
        System.exit(0);
    }
}