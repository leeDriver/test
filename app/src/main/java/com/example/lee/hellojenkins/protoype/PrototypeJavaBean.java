package com.example.lee.hellojenkins.protoype;

/**
 * Created by lee on 2017/1/10.
 */

public class PrototypeJavaBean implements Cloneable{


    private int param;

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    public PrototypeJavaBean(){}

    @Override
    protected PrototypeJavaBean clone() throws CloneNotSupportedException {
        try{
            return (PrototypeJavaBean)super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }

    }
}
