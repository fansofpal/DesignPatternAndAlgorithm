package com.hdw.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 动态代理
 * 1、绑定类加载器、接口、InvocationHandler（中介类，里面包含一个原对象）。
 * 2、生成增强对象的过程：Class<?> cl = getProxyClass0(loader, intfs);
 *  这里由jdk生成了一个增强代理类$Proxy0，放在内存里。反射增强类的构造函数，传入中介类，生成增强对象。
 * 3、调用增强对象的方法，方法内部为直接调用中介对象的invoke方法。
 * 4、因为jdk生成的$Proxy0对象继承了Proxy对象，同时实现了原对象接口。java继承机制不允许继承两次，所以
 * 只能代理接口，无法代理类。
 * user:hudawei1
 * date:2018/2/6
 * time:20:16
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args){
        Subject sub1 = new RealSubject();
        sub1.eating();
        log.info("==============分割线==============");
        Subject sub2 = new RealSubject();
        //在运行时，原引用指向的原对象被替换成增强对象，所以是动态代理。
        sub2 = (Subject) ProxyHandler.bind(sub2);
        sub2.eating();

    }
}
