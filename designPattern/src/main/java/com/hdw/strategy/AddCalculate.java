package com.hdw.strategy;

/**
 * user:hudawei1
 * date:2018/2/28
 * time:13:50
 */
public class AddCalculate implements CalculateStrategy{

    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
