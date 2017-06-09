/**
  * This program demonstrates that it  would not be possible to call  synchornized methods on the * same instance at the same time
 **/

package com.sriram.java;

import com.sriram.java.SyncExample;
import java.util.Date;

public class ThreadDemo3 {
    public static void main(String[] args) {
        SyncExample example = new SyncExample();
        Thread t1 = new Thread() {
            public void run() {
                System.out.println(new Date() + "Inside Thread1 run() method");
                example.syncMethod1();
            }
        };
        t1.start();
        
        Thread t2 = new Thread() {
            public void run() {
                System.out.println(new Date() + "Inside Thread2 run() method");
                example.synchMethod2();
            }
        };
        t2.start();
    }
}