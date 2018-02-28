package com.hdw.strategy;

/**
 * user:hudawei1
 * date:2018/2/28
 * time:13:53
 */
public class Context {
    private CalculateStrategy strategy;

    public Context(CalculateStrategy strategy){
        this.strategy = strategy;
    }

    public int execute(int a, int b){
        return strategy.calculate(a,b);
    }
}
