package com.hdw.command;

/**
 * user:hudawei1
 * date:2018/2/28
 * time:14:43
 */
public class Commander {
    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void command(){
        command.execute();
    }


}
