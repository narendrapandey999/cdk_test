package com.test.cdk;

public class PremiumClient extends Client{

    @Override
    public double calculateDiscount() {
        double discount = 0;

        if(purchaseAmount <= 4000 || purchaseAmount > 4000){
            if(purchaseAmount < 4000)
            discount = (purchaseAmount  * 10)/100;

            if(purchaseAmount >= 4000)
                discount = (4000 * 10)/100; //400
        }

        if(purchaseAmount > 4000){
            double subsequentDiscount=0;
            if(purchaseAmount > 4000 && purchaseAmount < 8000){
                subsequentDiscount = ((purchaseAmount - 4000) * 15)/100;//1000
            }

            if(purchaseAmount >= 8000){
                subsequentDiscount = (4000 * 15)/100;//1000
            }
            discount = discount+subsequentDiscount;
        }

        if(purchaseAmount > 8000 ){
            double subsequentDiscount=0;
            if(purchaseAmount > 8000 && purchaseAmount < 12000){
                subsequentDiscount = ((purchaseAmount - 8000) * 20)/100;//1000
            }

            if(purchaseAmount >= 12000){
                subsequentDiscount = (4000 * 20)/100;//1000
            }
            discount = discount+subsequentDiscount;

        }

        if(purchaseAmount > 12000){
            double subsequentDiscount=0;
            if(purchaseAmount > 12000 && purchaseAmount < 20000){
                subsequentDiscount = ((purchaseAmount - 12000) * 30)/100;//1000
            }

            if(purchaseAmount >= 20000){
                subsequentDiscount = (8000 * 30)/100;//1000
            }
            discount = discount+subsequentDiscount;

        }
        return discount;
    }
}