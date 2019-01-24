package com.lz.patterntest.CreationMode.BuilderPattern;

/**
 * Created by Administrator on 2019/1/24.
 * （指挥者）： 构建一个使用Builder接口的对象。
 * 它主要是用于创建一个复杂的对象。
 * 它主要有两个作用，一是：隔离了客户与对象的生产过程，二是：负责控制产品对象的生产过程。
 */

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    //2 set方法注入builder对象
    public void setBuilder(Builder builder) {
        this.builder=builder;
    }

    public Product construct(){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getProduct();
    }
}
