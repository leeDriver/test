package com.example.lee.hellojenkins.build;

/**
 * Created by lee on 2017/1/10.
 */

public class JavaBean {

    private final int param;
    private final int otherParam;


    public int getParam() {
        return param;
    }

    public int getOtherParam() {
        return otherParam;
    }

    private JavaBean (JavaBeanBuilder builder){

        this.param = builder.param;
        this.otherParam = builder.otherParam;

    }

    public static class JavaBeanBuilder implements IAbstractFactoryBuilder<JavaBean>{


        private int param;
        private int otherParam;

        public JavaBeanBuilder(){}

        public void setParam(int param) {
            this.param = param;
        }

        public void setOtherParam(int otherParam) {
            this.otherParam = otherParam;
        }

        @Override
        public JavaBean build() {

            return new JavaBean(this);
        }
    }

}
