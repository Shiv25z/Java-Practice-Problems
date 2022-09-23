package com.assignmentDay6;

import java.util.Scanner;


public class FibonacciSeries {
    static void fibonacci(int n)
    {
        int n1 = 0, n2 = 1;
        int count = 0;

        while (count < n) {
            System.out.print(n1+ " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            count = count + 1;

        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}

