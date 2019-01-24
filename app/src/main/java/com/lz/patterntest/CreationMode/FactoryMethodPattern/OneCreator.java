package com.lz.patterntest.CreationMode.FactoryMethodPattern;

/**
 * Created by Administrator on 2019/1/24.
 */

public class OneCreator extends Creator{

    @Override
    public <T extends Product> T creatProduce(Class<T> product) {
        Product product1 = null;
        try {
            product1 = (Product) Class.forName(product.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product1;
    }
}
