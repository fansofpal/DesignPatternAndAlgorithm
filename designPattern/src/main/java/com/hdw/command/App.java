package com.hdw.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 命令模式：
 * 场景：司令下发命令，士兵执行命令。司令不需要直接控制士兵来操作，只需要下发命令即可。实现了解耦。
 * 特点：一定有一个命令接口。
 * user:hudawei1
 * date:2018/2/28
 * time:14:35
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        Command shootingCommand = new ShootingCommand(new Soldier());//射击命令
        Command sleepingCommand = new SleepingCommand(new Soldier());//睡觉命令
        Commander commander = new Commander();//司令官
        //下发射击命令
        commander.setCommand(shootingCommand);
        commander.command();
        //下发睡觉命令
        commander.setCommand(sleepingCommand);
        commander.command();


    }
}
