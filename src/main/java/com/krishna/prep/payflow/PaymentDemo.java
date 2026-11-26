package com.krishna.prep.payflow;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new Payment("P1", 500.0, "USD");
        Payment p2 = new Payment("P2", 1000.0, "EUR");
        try {
            Payment bad = new Payment("Bad_Payment", -52.0, "INR");
        }  catch(IllegalArgumentException e){
            System.out.println("Rejected:- " + e.getMessage());
        }


        System.out.println(p1.getAmount());

        try {
            p1.setAmount(0.0);
        }
        catch(IllegalArgumentException e){
            System.out.println("Rejected:- " + e.getMessage());
        }

        p1.printDetails();
        p2.printDetails();

        System.out.println(p1.isHighValue());
        System.out.println(p2.isHighValue());



    }
}
