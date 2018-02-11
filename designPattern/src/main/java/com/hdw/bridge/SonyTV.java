package com.hdw.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/11
 * time:16:04
 */
public class SonyTV implements TV{
    private static final Logger log = LoggerFactory.getLogger(SonyTV.class);
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void switchChannel(String mes) {
        log.info(mes+"SonyTV 正在切换频道。。。");
    }
}
