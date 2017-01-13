package com.example.lee.hellojenkins.factory;


import com.example.lee.hellojenkins.factory.product.*;
import com.example.lee.hellojenkins.factory.product.ConcreteProduct;
import com.example.lee.hellojenkins.factory.product.OtherProduct;

/**
 * Created by lee on 2017/1/8.
 */

public class StaticFactory {


    enum ProductENUM {

        Concrete,other
    }
    public  static IProduct factoryMethod(ProductENUM Product_TYPE){

        switch (Product_TYPE){

            case Concrete:

                return new ConcreteProduct();
            case other:

                return new OtherProduct();
        }

        return new ConcreteProduct();
    }
}
