package com.hdw.singleton;

import java.util.Random;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:17:13
 */
public class Subject {
    int random = 0;

    public Subject(){
        random = new Random().nextInt(10000);
    }

    public int getRandomNumber(){
        return random;
    }
}
