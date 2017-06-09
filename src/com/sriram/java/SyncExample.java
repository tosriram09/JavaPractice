package com.sriram.java;

import java.util.Date;

public class SyncExample {
    public synchronized void syncMethod1() {
        System.out.println(new Date() + "Inside syncMethod1");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println(new Date() + "Out of syncMethod1");
    }
    
    public synchronized void synchMethod2() {
        System.out.println(new Date() + "Inside syncMethod2");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println(new Date() + "Out of syncMethod2");
    }
}