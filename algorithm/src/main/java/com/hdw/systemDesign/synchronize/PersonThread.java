package com.hdw.systemDesign.synchronize;

/**
 * user:hudawei1
 * date:2018/10/12
 * time:15:09
 */
public class PersonThread implements Runnable{
    SynchronizedTest synchronizedTest;


    PersonThread(SynchronizedTest synchronizedTest){
        this.synchronizedTest = synchronizedTest;
    }

    @Override
    public void run() {
        synchronizedTest.sleeping();
    }
}
