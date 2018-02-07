package com.hdw.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 动态代理
 * user:hudawei1
 * date:2018/2/6
 * time:20:16
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args){
        Subject sub1 = new RealSubject();
        sub1.eating();
        log.info("==============分割线==============");
        Subject sub2 = new RealSubject();
        sub2 = (Subject) ProxyHandler.bind(sub2);
        sub2.eating();

    }
}
