package com.hdw.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 外观模式（门面模式）
 * 其实就是封装，提供统一的门面类来管理一堆琐事。
 * 举例：有一群画家，A画家只会画圆，B画家只会画方块。现在我既要画圆又要画方块，又不想看见一堆乱七八糟的画家，怎么办？
 * 交给门面类统一解决。
 * user:hudawei1
 * date:2018/2/8
 * time:17:09
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        FacadePainter painter = new FacadePainter();
        log.info(painter.circleDrawing());
        log.info(painter.squareDrawing());
    }

}
