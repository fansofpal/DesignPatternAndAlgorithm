package com.hdw.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/11
 * time:16:08
 */
public class MiTV implements TV{
    private static final Logger log = LoggerFactory.getLogger(MiTV.class);
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void switchChannel(String mes) {
        log.info(mes+"小米TV正在切换频道。。");
    }
}
