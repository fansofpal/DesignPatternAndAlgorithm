package com.hdw.ChainOfResponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:11:21
 */
public abstract class Handler {
    public static final Logger log = LoggerFactory.getLogger(Handler.class);
    private Handler nextHandler;

    public void handle(Object obj){
        if(nextHandler != null){
            nextHandler.handle(obj);
        }
    }

    protected void nextHandler(Handler handler){
        this.nextHandler = handler;
    }
}
