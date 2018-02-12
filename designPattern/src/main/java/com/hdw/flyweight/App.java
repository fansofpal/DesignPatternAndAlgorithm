package com.hdw.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 享元模式--结构型模式
 * flyweight：蝇量级。为了提高性能采用的模式，工厂+hashmap，类似于单例模式，但是可以存储多种对象。
 * 举例：java的字符串池，定义相同字面量的字符串，在堆里其实是一个。
 * 这里定义一个接口和实现类，实现的对象都有自己的名字，如果想生产多个重名对象，获取的对象都是同一个。
 * user:hudawei1
 * date:2018/2/12
 * time:15:20
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight w1 = factory.getInstance("温家宝");
        FlyWeight w2 = factory.getInstance("李克强");
        FlyWeight w3 = factory.getInstance("温家宝");
        FlyWeight w4 = new ConcreteFlyWeight("温家宝");

        //w1,w3是同一对象，w1、w2、w4对象都不同
        w1.disPlay();
        w2.disPlay();
        w3.disPlay();
        w4.disPlay();

    }
}
