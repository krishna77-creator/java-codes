package com.krishna.prep.day06;

import java.util.Scanner;

public class FindMax {

    public static int findMax(int[] numbers){
        int max = numbers[0];
        for (int i=1; i<numbers.length;i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of values:- ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i<count;i++){
            System.out.print("Enter number " + (i+1) +  ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Max: " + findMax(numbers));

        scanner.close();
    }
}
