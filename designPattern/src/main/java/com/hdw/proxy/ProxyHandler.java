package com.hdw.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 看懂这个动态代理的例子，就可以很轻松的看懂mybatis插件的实现原理。
 * mybatis里接口和mapper映射也是动态代理，只不过最终没有执行method方法，在此之前已经根据statementID找到对应的节点实现了。
 * user:hudawei1
 * date:2018/2/7
 * time:9:45
 */
public class ProxyHandler implements InvocationHandler{
    private static final Logger log = LoggerFactory.getLogger(ProxyHandler.class);
    private Object tar;//需要代理的对象(其实传接口进来也行，写法上有点不一样)

    public ProxyHandler(Object tar){
        this.tar = tar;
    }


    /**
     * 这个bind方法是独立存在的，作用是：将要代理的对象的接口、类加载器、代理类，这三样东西绑定起来！
     * 返回一个增强版的代理对象的接口的实现类！
     * @param tar
     * @return
     */
    public static Object bind(Object tar){
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),tar.getClass().getInterfaces(),new ProxyHandler(tar));
    }


    /**
     * aop的实现一定出现在invoke方法里
     * 执行原接口的增强实现类方法的时候，一定会执行invoke方法,其中method.invoke就是执行了原对象的方法。
     * 可以在method前和后写代码来完成aop功能。
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("please wash your hands before eating!");
        return method.invoke(tar,args);
    }
}
