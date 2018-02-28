package com.hdw.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * user:hudawei1
 * date:2018/2/28
 * time:14:44
 */
public class ShootingCommand implements Command{
    private static final Logger log = LoggerFactory.getLogger(ShootingCommand.class);

    private Soldier soldier;

    public ShootingCommand(Soldier soldier){
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.shooting();
    }
}
