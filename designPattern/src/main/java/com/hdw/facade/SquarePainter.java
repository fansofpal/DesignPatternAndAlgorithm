package com.hdw.facade;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:18:05
 */
public class SquarePainter implements Painter{

    @Override
    public String drawing() {
        return "方画家只会画正方形，正在画正方形。。。";
    }
}
