package com.krishna.prep.day04;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for Prime:- ");
        int number = scanner.nextInt();
        boolean isPrime = number > 1;

      for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number + " is prime");
        }
        else{
            System.out.println(number + " is not a prime");
        }
        scanner.close();
    }
}
