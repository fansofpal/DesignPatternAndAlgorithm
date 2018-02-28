package com.hdw.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略模式：行为型模式
 * 通常用来自由的替换和选择算法。
 * 场景：两个数字进行计算，选择不同的计算方法，加法或者乘法。算法之间自由切换。
 * 特点：策略模式一般都有一个环境类Context
 * 策略模式和状态模式非常相似，策略模式中Context执行算法时不关心算法是什么，算法由外部提供。
 * 状态模式中，要用context.set来切换状态。
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
