package com.hdw.adaptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 适配器模式：结构型模式
 * 类适配，对象适配
 * 场景：现有代码使用了A接口和其方法，现在想改成B接口的实现方法。又不能动原来的A接口和调用的方法，怎么办？
 * 原有代码中的接口A不变，其调用方法也不变。仅仅改变A的实现类，就可以实现调用B接口方法。
 * A的实现类就是适配器。
 * user:hudawei1
 * date:2018/2/27
 * time:15:19
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        //A接口的原有实现
        A interA = new AImpl();
        interA.doSomething();

        //现要调用B接口方法，但不改变原有的A接口代码。
        A interA2 = new Adaptor(new BImpl());
        interA2.doSomething();


    }

}
