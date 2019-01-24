package com.lz.patterntest.CreationMode.SingletonPattern;

/**
 * Created by Administrator on 2019/1/24.
 * 双重检验锁
 */

public class Single3 {
    private volatile static Single3 instance;

    private Single3() {
    }

    public static Single3 getInstance() {
        if (instance == null) {
            synchronized (Single3.class) {
                if (instance == null) {
                    instance = new Single3();
                }
            }
        }
        return instance;
    }

}
