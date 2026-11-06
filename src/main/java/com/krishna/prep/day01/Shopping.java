package com.krishna.prep.day01;

public class Shopping {
    public static void main(String[] args) {
        double shirtPrice = 25.50;
        int quantity = 3;
        double taxRate = 0.08;
        double total;

        double subtotal = shirtPrice * quantity;
        double withTax = subtotal * taxRate;
        total = subtotal + withTax;

        System.out.println("SubTotal: " + subtotal);
        System.out.println("Tax: " + withTax );
        System.out.println("Total: " + total);
    }
}
