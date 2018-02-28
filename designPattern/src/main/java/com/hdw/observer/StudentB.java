package com.hdw.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:20:07
 */
public class StudentB implements Observer{
    private static final Logger log = LoggerFactory.getLogger(StudentB.class);

    @Override
    public void invoke(String mes) {
        log.info("StudentB 收到了高手的通知："+mes);
    }
}
