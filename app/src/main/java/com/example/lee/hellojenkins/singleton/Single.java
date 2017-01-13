package com.example.lee.hellojenkins.singleton;

/**
 * Created by lee on 2017/1/8.
 */

public class Single {


    private static Single INSTANCE = null;
    private static Object object = new Object();
    private Single(){}
    public static  Single getInstance(){

        if(INSTANCE == null){
            synchronized (object){
                if(INSTANCE == null)
                    INSTANCE = new Single();
            }
        }
        return INSTANCE;
    }

    public void leaveTheBuilding(){}
}
