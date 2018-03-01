package com.hdw.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/3/1
 * time:16:25
 */
public class ChatRoom {
    private static final Logger log = LoggerFactory.getLogger(ChatRoom.class);

    public static void chatting(User user,String msg){
        log.info("ChatRoom:"+"user:"+user.getName()+" said:"+msg);
    }
}
