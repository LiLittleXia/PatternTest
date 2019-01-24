package com.lz.patterntest.CreationMode.AbstractFactory;

/**
 * Created by Administrator on 2019/1/24.
 */

public class BikeFactory implements ToolFactory {
    @Override
    public Tool getTool() {
        return new Bike();
    }
}
