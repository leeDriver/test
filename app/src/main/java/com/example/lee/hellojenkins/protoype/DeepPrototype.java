package com.example.lee.hellojenkins.protoype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by lee on 2017/1/10.
 */

public class DeepPrototype implements Cloneable,Serializable {


    public DeepPrototype(){}

    private PrototypeJavaBeanSeril prototypeJavaBean;
    private int params;


    public PrototypeJavaBeanSeril getPrototypeJavaBean() {
        return prototypeJavaBean;
    }

    public void setPrototypeJavaBean(PrototypeJavaBeanSeril prototypeJavaBean) {
        this.prototypeJavaBean = prototypeJavaBean;
    }

    public int getParams() {
        return params;
    }

    public void setParams(int params) {
        this.params = params;
    }

    public DeepPrototype deepPrototype(){

        try{

            ByteArrayOutputStream aos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(aos);
            oos.writeObject(this);

            ByteArrayInputStream aoi = new ByteArrayInputStream(aos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(aoi);
            DeepPrototype obj = (DeepPrototype)ois.readObject();
            return obj;
        }catch (Exception e){

            e.getStackTrace();
            return null;
        }
    }

}
