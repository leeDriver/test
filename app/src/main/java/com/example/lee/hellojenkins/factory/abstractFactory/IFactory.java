package com.example.lee.hellojenkins.factory.abstractFactory;

/**
 * Created by lee on 2017/1/9.
 */

public interface IFactory {


    AbstractProductType createFactroyType();
    AbstractProductUsed createFactroyUsed();
}
