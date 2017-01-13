package com.example.lee.hellojenkins.factory.abstractFactory;

/**
 * Created by lee on 2017/1/9.
 */

public abstract class AbstractProductUsed implements IProduct {
    @Override
    public void name() {
        System.out.println("User name");
    }

    @Override
    public void productTime() {
        System.out.println("User time");
    }

    public abstract void  howUsed();

}
