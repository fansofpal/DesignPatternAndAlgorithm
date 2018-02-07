package com.hdw.singleton;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:17:09
 */
public class DoubleCheckSingleton {
    public static volatile Subject subject = null;

    public static Subject getSingleton(){
        if(subject == null){
            synchronized (DoubleCheckSingleton.class){
                if(subject == null){
                    subject = new Subject();
                }
            }
        }
        return subject;
    }

}
