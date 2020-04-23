package com.test.cdk;

public enum ClientType {
    REGULAR(new RegularClient()),
    PREMIUM(new PremiumClient());

    public final Client client;

    ClientType(Client client){
        this.client = client;
    }
}
