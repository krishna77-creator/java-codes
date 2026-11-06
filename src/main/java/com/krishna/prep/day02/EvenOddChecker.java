package com.krishna.prep.day02;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check even or odd:- ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;
        System.out.println("IsEven: " + isEven);
        scanner.close();
      }
}
