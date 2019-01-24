package com.lz.patterntest.CreationMode.SingletonPattern;

/**
 * Created by Administrator on 2019/1/24.
 * 静态内部类
 */

public class Single5 {

    private static class SingleHelper{
        private static final Single5 INSTANCE = new Single5();
    }

    private Single5() {
    }

    public static final Single5 getInstance(){
        return SingleHelper.INSTANCE;
    }

}
