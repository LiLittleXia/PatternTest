package com.lz.patterntest.CreationMode.BuilderPattern;

/**
 * Created by Administrator on 2019/1/24.
 * （抽象建造者）： 创建一个Product对象的各个部件指定的抽象接口。
 */

public abstract class Builder {

    private Product product = new Product();

    public abstract void buildA();
    public abstract void buildB();
    public abstract void buildC();

    public Product getProduct(){
        return product;
    }


}
