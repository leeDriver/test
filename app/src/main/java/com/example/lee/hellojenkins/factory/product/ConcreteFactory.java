package com.example.lee.hellojenkins.factory.product;

import com.example.lee.myapplication.factory.FactoryMethodPattern;

/**
 * Created by lee on 2017/1/8.
 */

public class ConcreteFactory<T> implements FactoryMethodPattern<T> {

    @Override
    public T FactoryMethod() {
        return null;
    }
}
