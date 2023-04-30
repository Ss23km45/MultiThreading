package com.coding.ninja.threads;

public class Thread2 extends Thread {
//    public void start(){
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Testing Thread2");
//        }
//    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Testing Thread2");
            //Current Thread
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
