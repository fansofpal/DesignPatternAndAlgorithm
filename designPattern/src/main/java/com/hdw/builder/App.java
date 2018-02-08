package com.hdw.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 建造者模式
 * 利用静态内部类建造房子。房子一经建好，就不能随意修改了，比setter/getter安全。
 * by the way: 类加载的时候不加载静态内部类，所以这是一种懒加载模式；static final又由jvm保证了只加载一次，所以线程安全。
 * 所以才会出现内部类实现的懒加载线程安全单例模式。会写么？
 * user:hudawei1
 * date:2018/2/8
 * time:9:26
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args){
        House.Builder builder = new House.Builder().buildDoor("这是门").buildWindow("这是窗户")
                .buildWall("这是墙");
        House house = builder.build();
        log.info("建造者模式建造的房子："+house.toString());


    }
}
