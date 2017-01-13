package com.example.lee.hellojenkins.protoype;

/**
 * Created by lee on 2017/1/10.
 */

public class Stack implements Cloneable {

    private Object[] elements;

    @Override
    protected Stack clone() throws CloneNotSupportedException {
        Stack stack = (Stack)super.clone();
        stack.elements = elements.clone();
        return stack;
    }
}
