package com.krishna.prep.day04;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = scanner.nextInt();
        int reversed = 0;
        boolean isNegative = n<0;
        if (n <0){
            n=-n;
        }
        while(n > 0){
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }
        if(isNegative){
            System.out.print("Reversed: " + -reversed);
        }
        else {
            System.out.print("Reversed: " + reversed);
        }
        scanner.close();
    }
}
