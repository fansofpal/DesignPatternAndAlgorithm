package com.hdw.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 观察者模式：行为型模式
 * 场景：高手帮助同学们写作业，同学们可以去自由活动。作业写完后，高手会通知同学们。
 * 同学们即为观察者，需要实现观察者接口。
 * user:hudawei1
 * date:2018/2/8
 * time:19:22
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        Observer observerA = new StudentA();
        Observer observerB = new StudentB();
        Master master = new Master();
        master.register(observerA).register(observerB);
        master.completeHomeWork();


    }
}
