package com.coding.ninja.runnable;

public class Thread1 implements Runnable {

    //A BAsic method
//    public void start(){
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Testing Thread1");
//        }
//    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Testing Thread1");
        }
    }
}
