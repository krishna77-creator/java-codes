package com.krishna.prep.payflow;

public class Payment {
    String id;
    double amount;
    String currency;

    void printDetails(){
        System.out.println(id + " " + amount + " " + currency);
    }

    boolean isHighValue(){
        return amount > 1000;
    }

}
