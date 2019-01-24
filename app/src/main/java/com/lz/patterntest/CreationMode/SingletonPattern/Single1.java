package com.lz.patterntest.CreationMode.SingletonPattern;

/**
 * Created by Administrator on 2019/1/24.
 * 线程不安全的懒汉式单例模式
 */

public class Single1 {
    private static Single1 instance;

    public Single1() {
    }

    public static Single1 getInstance() {
        if (null == instance) {
            instance = new Single1();
        }
        return instance;
    }
}
