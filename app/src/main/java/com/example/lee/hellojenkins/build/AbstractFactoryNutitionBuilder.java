package com.example.lee.hellojenkins.build;

/**
 * Created by lee on 2017/1/10.
 */

public class AbstractFactoryNutitionBuilder implements IAbstractFactoryBuilder<NutitionFacts>{

    @Override
    public NutitionFacts build() {

        NutitionFacts.Builder builder = new NutitionFacts.Builder(1);
        NutitionFacts nutitionFacts = builder.build();
        return nutitionFacts;
    }
}
