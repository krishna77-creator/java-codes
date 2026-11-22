package com.krishna.prep.payflow;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new Payment();
        p1.id = "P1";
        p1.amount = 500.0;
        p1.currency = "USD";

        Payment p2 = new Payment();
        p2.id = "P2";
        p2.amount = 10000.0;
        p2.currency = "EUR";

        p1.printDetails();
        p2.printDetails();

        System.out.println(p1.isHighValue());
        System.out.println(p2.isHighValue());

    }
}
