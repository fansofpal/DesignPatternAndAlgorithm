package com.hdw.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:9:41
 */
public class RealSubject implements Subject{
    private static final Logger log = LoggerFactory.getLogger(RealSubject.class);

    @Override
    public void eating() {
        log.info("RealSubject is eating now...");
    }
}
