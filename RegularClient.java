package com.test.cdk;

public class RegularClient extends Client {

    @Override
    public double calculateDiscount() {
        double discount = 0;

        if(purchaseAmount > 5000){
            if(purchaseAmount > 5000 && purchaseAmount < 10000){
                discount = ((purchaseAmount - 5000)*10)/100;
            }
            if(purchaseAmount >= 10000){
                discount = (5000 * 10)/100;
            }
        }


        if(purchaseAmount > 10000){
            double subsequentDiscount=0;
            if(purchaseAmount > 10000 && purchaseAmount < 15000){
                subsequentDiscount = ((purchaseAmount - 10000) * 20)/100;
                discount = discount+subsequentDiscount;
            }

            if(purchaseAmount >= 15000){
                subsequentDiscount = (5000 * 20)/100;
            }
            discount = discount+subsequentDiscount;
        }


        return discount;
    }
}
