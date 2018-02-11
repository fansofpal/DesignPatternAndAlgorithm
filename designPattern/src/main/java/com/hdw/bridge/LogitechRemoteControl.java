package com.hdw.bridge;

/**
 * user:hudawei1
 * date:2018/2/11
 * time:16:13
 */
public class LogitechRemoteControl extends RemoteControl{


    public LogitechRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    public void control() {
        tv.switchChannel("罗技遥控器正在控制：");
    }
}
