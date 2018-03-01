package com.hdw.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 中介者模式：行为型模式
 * 场景：聊天室，原来是多个用户点对点聊天，现在都通过聊天室聊天。
 * 由网状结构变成了星状结构
 * user:hudawei1
 * date:2018/3/1
 * time:15:48
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args){
        User u1 = new User("逍遥");
        User u2 = new User("灵儿");
        u1.sendMsg("你好");
        u2.sendMsg("你好");
    }
}
