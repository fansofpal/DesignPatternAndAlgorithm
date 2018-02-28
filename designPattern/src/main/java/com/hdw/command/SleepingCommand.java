package com.hdw.command;

/**
 * user:hudawei1
 * date:2018/2/28
 * time:15:02
 */
public class SleepingCommand implements Command{
    private Soldier soldier;

    public SleepingCommand(Soldier soldier){
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.eating();
    }
}
