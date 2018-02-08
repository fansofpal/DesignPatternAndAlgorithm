package com.hdw.factory;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:14:19
 */
public class CarFactory {

    /**
     * 根据类型反射出对象。
     * 如果你愿意，你可以传入不同的参数，new出不同的对象；也可以在这里使用单例模式，只返回同一个对象。
     * @param cls
     * @return
     */
    public static Object getInstance(Class cls){
        Object obj;
        try{
            obj = Class.forName(cls.getName()).newInstance();
        }catch (Exception e){
            return null;
        }
        return obj;

    }
}
