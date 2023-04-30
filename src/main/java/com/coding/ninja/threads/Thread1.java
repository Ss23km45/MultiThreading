package com.coding.ninja.threads;

public class Thread1 extends Thread {

    //A BAsic method
//    public void start(){
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Testing Thread1");
//        }
//    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Testing Thread1");
            //Current Thread Name
            System.out.println(Thread.currentThread().getName());
            try {
                stop();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
