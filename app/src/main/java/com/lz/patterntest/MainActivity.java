package com.lz.patterntest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lz.patterntest.CreationMode.ArchetypalModel.Mail;
import com.lz.patterntest.CreationMode.ArchetypalModel.Template;
import com.lz.patterntest.CreationMode.BuilderPattern.Builder;
import com.lz.patterntest.CreationMode.BuilderPattern.Concrete2Builder;
import com.lz.patterntest.CreationMode.BuilderPattern.ConcreteBuilder;
import com.lz.patterntest.CreationMode.BuilderPattern.Director;
import com.lz.patterntest.CreationMode.BuilderPattern.Product;
import com.lz.patterntest.CreationMode.AbstractFactory.BikeFactory;
import com.lz.patterntest.CreationMode.AbstractFactory.BusFactory;
import com.lz.patterntest.CreationMode.AbstractFactory.Tool;
import com.lz.patterntest.CreationMode.FactoryMethodPattern.MuttonProduct;
import com.lz.patterntest.CreationMode.FactoryMethodPattern.OneCreator;

/**
 * https://juejin.im/post/5c47d61ae51d4551df6f26b4
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //建造者test
        builderPatternTest();
        //工厂模式test
        factoryMethodPatternTest();
        //抽象工厂模式test
        abstractFactoryTest();
        //原型模式--浅克隆
        archetypeModel();
    }

    private void archetypeModel() {
        Mail mail = new Mail(new Template());
        for (int i = 0; i < 10; i++) {
            try {
                //这里克隆了10份上面的mail
                Mail cMail = (Mail) mail.clone();
                cMail.setReceiver("lz.com");
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

    private void factoryMethodPatternTest() {
        OneCreator creator = new OneCreator();
        MuttonProduct muttonProduct = creator.creatProduce(MuttonProduct.class);
        muttonProduct.method();
    }

    private void abstractFactoryTest() {
        //坐公交上班
        BusFactory busFactory = new BusFactory();
//        busFactory.getTool().goWork();
        Tool bus = busFactory.getTool();
        bus.goWork();

        //骑自行车上班
        BikeFactory bikeFactory = new BikeFactory();
//        bikeFactory.getTool().goWork();
        Tool bike = bikeFactory.getTool();
        bike.goWork();
    }

    private void builderPatternTest() {
        //aaabbbccc
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();

        //111222333
        Builder builder2 = new Concrete2Builder();
        director.setBuilder(builder2);
        Product product2 = director.construct();
    }
}
