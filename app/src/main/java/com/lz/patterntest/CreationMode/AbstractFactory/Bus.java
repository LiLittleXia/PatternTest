package com.lz.patterntest.CreationMode.AbstractFactory;

/**
 * Created by Administrator on 2019/1/24.
 * 具体的产品：各个不同的实例对象类
 */

public class Bus implements Tool{

    @Override
    public void goWork() {
        System.out.print("坐公交上班");
    }
}
