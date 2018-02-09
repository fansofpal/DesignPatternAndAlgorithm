package com.hdw.chainOfResponsibility.baseDemo;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:11:29
 */
public class LastHandler extends Handler{

    @Override
    public void handle(Object obj) {
        String mes = (String)obj;
        mes += "完毕！";
        super.handle(mes);
        log.info(mes);
    }
}
