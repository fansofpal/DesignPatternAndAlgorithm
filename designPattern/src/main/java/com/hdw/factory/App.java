package com.hdw.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 工厂模式
 * 汽车工厂：基于汽车接口，有宝马汽车和奥迪汽车等实现对象。平时使用时到处new对象，还是各种类型的对象，不觉得乱么，以后怎么管理？
 * 所以我们需要汽车工厂，由该工厂统一生产不同品牌的汽车。
 * 如果生产摩托车呢，还需要摩托车工厂。工厂的类型多了该怎么管理？
 * 所以我们需要抽象工厂模式。
 * user:hudawei1
 * date:2018/2/8
 * time:10:08
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args){
        Car audi = (AudiCar)CarFactory.getInstance(AudiCar.class);
        log.info(audi.running());
        Car BMW = (BMWCar)CarFactory.getInstance(BMWCar.class);
        log.info(BMW.running());
    }


}
