package com.coding.ninja.threads;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Thread1 obj1 = new Thread1();
//        Thread2 obj2 = new Thread2();
//
//        obj1.start();
//        obj2.start();
        //In Order to avoid the above thing that only after Object 1 completes execute the Object 2
        //This is where threads comes to picture here we can run these parallel
        //Runtime.getRuntime().exec("notepad");

        Thread obj1 = new Thread1();
        Thread obj2 = new Thread2();
        obj1.setPriority(2);
        obj2.setPriority(1);
        //Priority of threads
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();








    }
}