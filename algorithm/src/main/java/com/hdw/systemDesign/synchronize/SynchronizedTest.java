package com.hdw.systemDesign.synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * synchronized对象方法1和方法2同时加锁后，线程1访问方法1阻塞；线程2能否调用方法2？
 * 不能，原因在对象头部的锁信息。注意偏向锁、轻量级锁、自旋锁、重量级锁的区别。
 *
 * user:hudawei1
 * date:2018/10/12
 * time:9:47
 */
public class SynchronizedTest implements Runnable{
    /**
     * 核心池线程和最大线程数的关系：核心池满了则放入临时队列，队列满了再增加线程至最大线程数。
     */
    static ExecutorService executorService = Executors.newFixedThreadPool(10);


    public static void main(String[] args) {

        SynchronizedTest test = new SynchronizedTest();

        Thread thread1 = new Thread(test);

        PersonThread personThread = new PersonThread(test);
        Thread thread2 = new Thread(personThread);

        thread1.start();
        thread2.start();


    }

    @Override
    public void run() {
        /**
         *  同一线程对自身对象加锁后，也可以执行该对象里的加锁方法。
         *  说明synchronized为可重入锁。该锁为不公平锁，如需使用公平锁，建议ReenTrantLock
         *
         */
        synchronized(this){
            System.out.println("对自身对象加锁...");
            this.eating();
        }

    }

    public synchronized void eating(){
        System.out.println(Thread.currentThread().getName()+" start eating.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" end eating.");
    }

    public synchronized void sleeping(){
        System.out.println(Thread.currentThread().getName()+" start sleeping.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" end sleeping.");
    }
}
