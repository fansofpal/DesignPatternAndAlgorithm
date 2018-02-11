package com.hdw.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 桥接模式--结构型模式
 * 举例：现在有电视接口和遥控器抽象类，电视可以有多种品牌，遥控器也有多种品牌。如何实现匹配？
 * 电视有多厂家的实现，遥控器也有多厂家的实现。在遥控器抽象中传入电视接口，即可实现桥接。
 * 亦可参照：jdbc多厂家实现
 * user:hudawei1
 * date:2018/2/11
 * time:15:36
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args){
        TV miTV = new MiTV();
        TV SonyTV = new SonyTV();
        RemoteControl remoteControl = new LogitechRemoteControl(miTV);
        remoteControl.control();

    }
}
