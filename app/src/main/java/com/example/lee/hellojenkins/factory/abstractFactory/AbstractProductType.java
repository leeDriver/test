package com.example.lee.hellojenkins.factory.abstractFactory;

/**
 * Created by lee on 2017/1/9.
 */

public abstract class AbstractProductType implements IProduct {
    @Override
    public void name() {
        System.out.println("name");
    }

    @Override
    public void productTime() {
        System.out.println("productTime");
    }

    public abstract void productType();
}
