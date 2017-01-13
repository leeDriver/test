package com.example.lee.hellojenkins.build;

/**
 * Created by lee on 2017/1/10.
 */

public class UseAbstractFactoryNutitionFacts {

    private final int  servingSize;
    private final int fat;

    public static class Builder implements IAbstractFactoryBuilder<UseAbstractFactoryNutitionFacts>{


        private int servingSize;
        private int fat;
        public Builder(){}

        public void setServingSize(int servingSize) {
            this.servingSize = servingSize;
        }

        public void setFat(int fat) {
            this.fat = fat;
        }

        @Override
        public UseAbstractFactoryNutitionFacts build() {
            return new UseAbstractFactoryNutitionFacts(this);
        }
    }
    private UseAbstractFactoryNutitionFacts(Builder builder){

        this.servingSize = builder.servingSize;
        this.fat = builder.fat;
    }
}
