package com.example.lee.hellojenkins.factory;

/**
 * Created by lee on 2017/1/8.
 */

public class GenericStaticFactory {


    private static IFactory<Object> IDENTITY_FUNCTION = new IFactory<Object>() {

        @Override
        public Object FactoryMethod(Object arg) {
            return arg;
        }
    };

    public static <T> IFactory<T> identityFuntion(){
        return (IFactory<T>) IDENTITY_FUNCTION;
    }

}
