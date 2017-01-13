package com.example.lee.hellojenkins.factory.abstractFactory;

/**
 * Created by lee on 2017/1/9.
 */

public class AbstractFactory implements IFactory {

    @Override
    public AbstractProductType createFactroyType() {

        return new NikeProductType();
    }

    @Override
    public AbstractProductUsed createFactroyUsed() {

        return new NikeProductUsed();
    }
}
