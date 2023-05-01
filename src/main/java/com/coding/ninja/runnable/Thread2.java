package com.coding.ninja.runnable;

public class Thread2 implements Runnable {
//    public void start(){
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Testing Thread2");
//        }
//    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Testing Thread2");
        }
    }
}
