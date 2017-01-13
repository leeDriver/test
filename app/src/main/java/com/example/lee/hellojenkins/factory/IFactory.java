package com.example.lee.hellojenkins.factory;

/**
 * Created by lee on 2017/1/8.
 */

public  interface IFactory<T> {


    T FactoryMethod(T arg);
}
