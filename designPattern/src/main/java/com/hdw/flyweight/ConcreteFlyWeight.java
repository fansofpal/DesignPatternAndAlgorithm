package com.hdw.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/12
 * time:15:32
 */
public class ConcreteFlyWeight implements FlyWeight{
    private static final Logger log = LoggerFactory.getLogger(ConcreteFlyWeight.class);
    private String name;

    public ConcreteFlyWeight(String name){
        this.name = name;
    }


    @Override
    public void disPlay() {
        log.info("此对象的名称是："+name+";内存地址为："+this.toString());
    }
}
