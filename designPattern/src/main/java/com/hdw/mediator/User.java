package com.hdw.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/3/1
 * time:16:27
 */
public class User {
    private static final Logger log = LoggerFactory.getLogger(User.class);
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMsg(String mes){
        ChatRoom.chatting(this,mes);
    }
}
