package com.hdw.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:14:13
 */
public class AudiCar implements Car{
    private static final Logger log = LoggerFactory.getLogger(AudiCar.class);

    @Override
    public String running() {
        return "一辆奥迪在路上驰骋。";
    }
}
