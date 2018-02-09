package com.hdw.chainOfResponsibility.baseDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 责任链模式
 * 这是一种最基础的写法：提供一个抽象类。每个handler对象里都包含了下一个对象的引用。
 * 执行第一个handler即开始传递消息，直到终点。
 * 开源框架中更为常见的是filter写法。
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
