package com.krishna.prep.day03;

import java.util.Scanner;

public class MedianOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int num1 = scanner.nextInt();
        System.out.print("Enter middle number:- ");
        int num2 = scanner.nextInt();
        System.out.print("Enter last number:- ");
        int num3 = scanner.nextInt();

        if( (num1>=num2 && num1<=num3) || (num1 >= num3 && num1<= num2))
        {
            System.out.print("Median: " + num1);
        }
        else if ( (num2>=num1 && num2<=num3) || ( num2 >= num3 && num2 <= num1) ) {
            System.out.print("Median:- " + num2);
        }
        else {
            System.out.print("Median:- " + num3);
        }

        scanner.close();
    }
}
