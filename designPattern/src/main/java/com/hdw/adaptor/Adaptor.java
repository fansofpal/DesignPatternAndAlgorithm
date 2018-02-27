package com.hdw.adaptor;

/**
 * user:hudawei1
 * date:2018/2/27
 * time:16:08
 */
public class Adaptor implements A{
    private B b;

    public Adaptor(B b){
        this.b = b;
    }

    @Override
    public void doSomething() {
        b.doSomething();
    }
}
