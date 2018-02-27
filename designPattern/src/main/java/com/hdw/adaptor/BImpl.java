package com.hdw.adaptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/27
 * time:16:12
 */
public class BImpl implements B{
    private static final Logger log = LoggerFactory.getLogger(BImpl.class);

    @Override
    public void doSomething() {
        log.info("BImpl is doing something...");
    }
}
