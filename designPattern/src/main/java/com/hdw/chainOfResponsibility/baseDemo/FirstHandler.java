package com.hdw.chainOfResponsibility.baseDemo;

/**
 * 类似于netty消息传递的责任链。
 * 特点就是每个handler里保存了下一个节点对象。
 * user:hudawei1
 * date:2018/2/7
 * time:11:19
 */
public class FirstHandler extends Handler{

    @Override
    public void handle(Object obj) {
        String mes = (String)obj;
        mes += "FirstHandler负责打开冰箱门；";
        super.handle(mes);
    }
}
