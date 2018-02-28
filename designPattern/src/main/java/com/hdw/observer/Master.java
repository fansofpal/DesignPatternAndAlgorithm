package com.hdw.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个其实是被观察者，也是通知的发起者
 * user:hudawei1
 * date:2018/2/8
 * time:19:26
 */
public class Master {

    private List<Observer> list = new ArrayList<Observer>();


    public Master register(Observer observer){
        list.add(observer);
        return this;
    }

    public void completeHomeWork(){
        for(Observer observer:list){
            observer.invoke("作业已经做完了！");
        }
    }
}
