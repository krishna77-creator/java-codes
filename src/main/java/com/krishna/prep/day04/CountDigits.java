package com.krishna.prep.day04;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = scanner.nextInt();
        int count = 0;
        if (number <0){
            number = -number;
        }
        do{
            number = number / 10;
            count++;
        } while(number>0);

        System.out.println("Digits:- " + count);
        scanner.close();
    }
}
