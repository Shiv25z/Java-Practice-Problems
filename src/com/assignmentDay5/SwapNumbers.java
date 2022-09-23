package com.assignmentDay5;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a:");
        int a =sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();

        int temp=0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping Values: ");
        System.out.println("A = "+a);
        System.out.println("B = "+b);


    }
}
