package com.krishna.prep.payflow;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new Payment("P1", -500.0, "USD");

        Payment p2 = new Payment("P2", 1000.0, "EUR");

        System.out.println(p1.getAmount());
        p1.setAmount(-50.0);


        p1.printDetails();
        p2.printDetails();

        System.out.println(p1.isHighValue());
        System.out.println(p2.isHighValue());



    }
}
