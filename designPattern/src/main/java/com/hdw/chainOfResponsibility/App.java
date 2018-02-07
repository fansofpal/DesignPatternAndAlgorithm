package com.hdw.chainOfResponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 责任链模式
 * user:hudawei1
 * date:2018/2/7
 * time:11:15
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();
        Handler thirdHandler = new ThirdHandler();
        Handler lastHandler = new LastHandler();
        firstHandler.nextHandler(secondHandler);
        secondHandler.nextHandler(thirdHandler);
        thirdHandler.nextHandler(lastHandler);
        firstHandler.handle("把一头大象装进冰箱：");

    }
}
