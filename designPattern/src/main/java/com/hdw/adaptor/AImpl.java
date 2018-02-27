package com.hdw.adaptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/27
 * time:16:05
 */
public class AImpl implements A{
    private static final Logger log = LoggerFactory.getLogger(AImpl.class);

    @Override
    public void doSomething() {
        log.info("AImpl is doing something...");
    }
}
