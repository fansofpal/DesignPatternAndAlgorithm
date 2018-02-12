package com.hdw.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * user:hudawei1
 * date:2018/2/12
 * time:15:38
 */
public class FlyWeightFactory {
    private Map<String,FlyWeight> map = new ConcurrentHashMap<String,FlyWeight>();


    public FlyWeight getInstance(String name){
        FlyWeight flyWeight = map.get(name);
        if(flyWeight == null){
            flyWeight = new ConcreteFlyWeight(name);
            map.put(name,flyWeight);
        }
        return flyWeight;
    }

}
