package com.hdw.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单例模式
 * 这里实现一个double check的懒加载单例
 * user:hudawei1
 * date:2018/2/7
 * time:17:06
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Subject subject = DoubleCheckSingleton.getSingleton();
            log.info("看看对象是不是同一个："+subject.getRandomNumber());
        }
    }


}
