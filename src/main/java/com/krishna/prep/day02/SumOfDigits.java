package com.krishna.prep.day02;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3 digit number to check the sum of digits: ");
        int digits = scanner.nextInt();
        int rem = digits % 10;
        int quot = digits / 10;
        int temp1 = quot / 10;
        int temp2 = quot % 10;

        int result = rem + temp1+ temp2;
        System.out.println("sum of Digits:- " + result);
        scanner.close();
    }
}
