package com.hdw.systemDesign.classLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/9/27
 * time:14:10
 */
public class MyClassLoader extends ClassLoader{
    private static final Logger log = LoggerFactory.getLogger(MyClassLoader.class);


    /**
     * 重写ClassLoader的findClass方法，即可定义自己的类加载器
     * 如果想脱离双亲委托，可以直接重写loadClass方法
     * @param name
     * @return
     * @throws ClassNotFoundException
     */
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //
        return null;
    }



    public static void main(String[] args) {
        ClassLoader c = MyClassLoader.class.getClassLoader();
        log.info("==c:=={}",c);
        ClassLoader c1 = c.getParent();
        log.info("==c1:=={}",c1);
        ClassLoader c2 = c1.getParent();
        log.info("==c2:=={}",c2);
    }
}
