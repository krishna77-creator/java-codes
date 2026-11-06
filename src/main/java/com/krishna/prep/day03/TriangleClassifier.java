package com.krishna.prep.day03;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1:- ");
        int a = scanner.nextInt();

        System.out.print("Enter side 2:- ");
        int b = scanner.nextInt();

        System.out.print("Enter side 3:- ");
        int c = scanner.nextInt();

        boolean isRightAngled = false;

        if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
            isRightAngled = true;
        }

        if ( (a<=0 || b<=0 || c<=0 ) || ( a+b<=c || a+c <= b || b+c <=a ) ){
            System.out.print("Invalid");
        }
        else if(a==b && b==c && c==a){
            System.out.print("Equilateral");
        }
        else if( a==b || b==c || c==a ){
            System.out.print("Isosceles");
        }
        else {
            String triangleType = "Scalene";
            if (isRightAngled){
                triangleType = triangleType + " (right-angled)";
            }
            System.out.println(triangleType);

        }

    }
}
