package com.hdw.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:14:17
 */
public class BMWCar implements Car{
    private static final Logger log = LoggerFactory.getLogger(BMWCar.class);

    @Override
    public String running() {
        return "一辆宝马正在路上驰骋。";
    }
}
