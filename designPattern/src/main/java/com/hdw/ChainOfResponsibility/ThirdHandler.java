package com.hdw.ChainOfResponsibility;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:11:29
 */
public class ThirdHandler extends Handler{

    @Override
    public void handle(Object obj) {
        String mes = (String)obj;
        mes += "ThirdHandler负责关上冰箱门；";
        super.handle(mes);
    }
}
