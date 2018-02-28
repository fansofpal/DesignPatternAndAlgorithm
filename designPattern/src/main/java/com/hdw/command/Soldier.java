package com.hdw.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/28
 * time:14:46
 */
public class Soldier {
    private static final Logger log = LoggerFactory.getLogger(Soldier.class);

    public void eating(){
        log.info("士兵开始睡觉。。。");
    }

    public void sleeping(){}

    public void shooting(){
        log.info("士兵开枪射击。。。");
    }
}
