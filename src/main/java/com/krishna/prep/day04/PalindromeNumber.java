package com.krishna.prep.day04;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number to check for palindrome:- ");
        int n = scanner.nextInt();

        int reversed = 0;
        int original = n;

        while(n>0){
            int rem = n%10;
            reversed = reversed * 10 + rem;
            n = n/10;
        }
        if (original==reversed){
            System.out.println(original + " is a Palindrome");
        }
        else{
            System.out.println(original + " Not a palindrome");
        }
        scanner.close();
    }
}
