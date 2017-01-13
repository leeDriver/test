package com.example.lee.hellojenkins.factory.abstractFactory;

/**
 * Created by lee on 2017/1/9.
 */

public class NikeProductType extends AbstractProductType {


    @Override
    public void productType() {
        System.out.println(getClass().getSimpleName());
    }
}
