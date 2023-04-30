package com.coding.ninja.synchronize;

public class Thread2 extends Thread {

    //By using synchronized only after this thread completed
    // the execution it will start the other execution
    public synchronized void start(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Testing Thread2");
        }
    }
}
