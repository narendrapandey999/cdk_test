package com.test.cdk;

public class BillMain {
    public static void main(String[] args) {
        String clientType  = args[0];
        double purchaseAmount  = Double.parseDouble(args[1]);
        ClientType clientValue = ClientType.valueOf(clientType);
        Client client = clientValue.client;

        client.purchaseAmount = purchaseAmount;

        double discount = client.calculateDiscount();

        System.out.println("Final purchase price- "+(purchaseAmount-discount));

    }
}
