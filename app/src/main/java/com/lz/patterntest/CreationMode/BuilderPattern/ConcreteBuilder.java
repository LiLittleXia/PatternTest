package com.lz.patterntest.CreationMode.BuilderPattern;

/**
 * Created by Administrator on 2019/1/24.
 * （具体建造者）： 实现抽象接口，构建和装配各个部件。
 */

public class ConcreteBuilder extends Builder {
    @Override
    public void buildA() {
        getProduct().setPartA("aaaa");
    }

    @Override
    public void buildB() {
        getProduct().setPartA("bbbbb");
    }

    @Override
    public void buildC() {
        getProduct().setPartA("ccccc");
    }
}
