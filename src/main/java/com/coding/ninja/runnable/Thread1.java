package com.coding.ninja.runnable;

public class Thread1 extends Thread {

    //A BAsic method
//    public void start(){
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Testing Thread1");
//        }
//    }

    public void run(){
        for (int i = 0; i < 5; i++) {

            try {

                wait();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notify();
            System.out.println("Testing Thread1");
        }
    }
}
