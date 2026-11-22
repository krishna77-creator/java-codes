package com.krishna.prep.payflow;

public class Payment {
    private String id;
    private double amount;
    private String currency;
    private static final double HIGH_VALUE_THRESHOLD = 1000;

    public Payment(String id, double amount, String currency){
        this.id = id;
        this.amount = amount;
        this.currency = currency;
    }

    public void printDetails(){
        System.out.println(id + " " + amount + " " + currency);
    }

    public boolean isHighValue(){
        return amount >= HIGH_VALUE_THRESHOLD ;
    }

    public String getId(){
        return id;
    }
    public double getAmount(){
        return amount;
    }
    public String getCurrency(){
        return currency;
    }

    public void setAmount(double amount){
        if(amount > 0){
            this.amount = amount;
        }
    }

}
