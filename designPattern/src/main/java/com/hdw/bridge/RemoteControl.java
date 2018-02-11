package com.hdw.bridge;

/**
 * user:hudawei1
 * date:2018/2/11
 * time:16:10
 */
public abstract  class RemoteControl {

    protected TV tv;

    public RemoteControl(TV tv){
        this.tv = tv;
    }

    public abstract void control();

}
