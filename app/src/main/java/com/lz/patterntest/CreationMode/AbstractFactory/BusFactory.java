package com.lz.patterntest.CreationMode.AbstractFactory;

/**
 * Created by Administrator on 2019/1/24.
 * .具体的工厂子类，分别为每个具体的产品类创建不同的工厂子类：
 */

public class BusFactory implements ToolFactory {

    @Override
    public Tool getTool() {
        return new Bus();
    }
}
