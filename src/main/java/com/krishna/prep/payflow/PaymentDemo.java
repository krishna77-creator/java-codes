package com.krishna.prep.payflow;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new Payment();
        p1.id = "P1";
        p1.amount = 500.0;
        p1.currency = "USD";

        Payment p2 = new Payment();
        p2.id = "P2";
        p2.amount = 100.0;
        p2.currency = "EUR";

        System.out.println(p1.id + " " + p1.amount + " " + p1.currency);
        System.out.println(p2.id + " " + p2.amount + " " + p2.currency);
        p2.amount = 777.77;
        System.out.println("Updated amount of ayment 2 is " + p2.amount);

    }
}
