package com.example.lee.hellojenkins.factory.product;

/**
 * Created by lee on 2017/1/8.
 */

public class ConcreteProduct implements IProduct {

    @Override
    public void name(){

        System.out.println("ConcreteProduct");
    }
}
