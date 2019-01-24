package com.lz.patterntest.CreationMode.SingletonPattern;

/**
 * Created by Administrator on 2019/1/24.
 * 相对安全的懒汉式-并不高效
 */

public class Single2 {
    private static Single2 instance;

    private Single2() {
    }

    public static synchronized Single2 getInstance(){
        if (instance == null) {
            instance = new Single2();
        }
        return instance;
    }
}
