package com.lz.patterntest.CreationMode.BuilderPattern;

/**
 * Created by Administrator on 2019/1/24.
 * （具体建造者）： 实现抽象接口，构建和装配各个部件。
 */

public class Concrete2Builder extends Builder {
    @Override
    public void buildA() {
        getProduct().setPartA("11111");
    }

    @Override
    public void buildB() {
        getProduct().setPartA("22222");
    }

    @Override
    public void buildC() {
        getProduct().setPartA("33333");
    }
}
