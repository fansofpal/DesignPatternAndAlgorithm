package com.hdw.ChainOfResponsibility;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:11:29
 */
public class SecondHandler extends Handler{

    @Override
    public void handle(Object obj) {
        String mes = (String)obj;
        mes += "SecondHandler负责把大象推进冰箱；";
        super.handle(mes);
    }
}
