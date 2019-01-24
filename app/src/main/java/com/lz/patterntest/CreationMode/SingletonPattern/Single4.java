package com.lz.patterntest.CreationMode.SingletonPattern;

/**
 * Created by Administrator on 2019/1/24.
 * 饿汉式
 */

public class Single4 {

    private static final Single4 instance = new Single4();

    private Single4() {
    }

    public static Single4 getInstance(){
        return instance;
    }
}
