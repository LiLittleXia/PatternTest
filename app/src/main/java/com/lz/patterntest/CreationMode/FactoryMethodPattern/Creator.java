package com.lz.patterntest.CreationMode.FactoryMethodPattern;

/**
 * Created by Administrator on 2019/1/24.
 */

public abstract class Creator {
    public abstract <T extends Product> T creatProduce(Class<T> product);
}
