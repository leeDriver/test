package com.example.lee.hellojenkins.protoype;

import java.io.Serializable;

/**
 * Created by lee on 2017/1/10.
 */

public class PrototypeJavaBeanSeril implements Serializable{


    private int param;

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    public PrototypeJavaBeanSeril(){}
}
