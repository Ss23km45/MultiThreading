package com.coding.ninja.runnable;

import com.coding.ninja.runnable.Thread1;
import com.coding.ninja.runnable.Thread2;

public class Main {
    public static void main(String[] args) {


        Thread obj1 = new Thread1();
        Runnable obj2 = new Thread2();

        obj1.run();
        obj2.run();
;
    }
}
