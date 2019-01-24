package com.lz.patterntest.CreationMode.AbstractFactory;

/**
 * Created by Administrator on 2019/1/24.
 */

public class Bike implements Tool {
    @Override
    public void goWork() {
        System.out.print("骑自行车上班");
    }
}
