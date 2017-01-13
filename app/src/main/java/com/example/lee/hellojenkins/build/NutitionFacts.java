package com.example.lee.hellojenkins.build;

/**
 * Created by lee on 2017/1/10.
 */

public class NutitionFacts {

    private final int  servingSize;
    private final int fat;

    public static class Builder{

        private int servingSize;
        private int fat;

        public Builder(int fat){
            this.fat = fat;
        }
        public Builder setServingSize(int servingSize) {
            this.servingSize = servingSize;
            return this;
        }


        public Builder setFat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutitionFacts build(){
            return new NutitionFacts(this);
        }
    }
    private NutitionFacts(Builder builder){

        this.servingSize = builder.servingSize;
        this.fat = builder.fat;
    }
}
