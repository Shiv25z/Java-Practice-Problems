package com.assignmentDay5;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Dividend number:");
        int a = sc.nextInt();;
        System.out.print(" Enter the Divisor number:");
        int b = sc.nextInt();

        float quotient = (float) a / (float)b;
        int remainder = a % b;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
