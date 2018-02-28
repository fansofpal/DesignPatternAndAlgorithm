package com.hdw.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略模式：行为型模式
 * 通常用来自由的替换和选择算法。
 * 场景：两个数字进行计算，选择不同的计算方法，加法或者乘法。算法之间自由切换。
 * 特点：策略模式一般都有一个环境类Context
 * user:hudawei1
 * date:2018/2/28
 * time:13:42
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args){
        CalculateStrategy add = new AddCalculate();
        CalculateStrategy multiply = new MultiplyStrategy();

        Context context = new Context(multiply);
        int result = context.execute(1,0);
        log.info("计算结果为："+ result);

    }
}
