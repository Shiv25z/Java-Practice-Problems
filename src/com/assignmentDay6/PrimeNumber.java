package com.assignmentDay6;

import java.util.Scanner;

public class PrimeNumber {
    static boolean prime(int n)
    {
        if (n <= 1)
            return false;

        else if (n == 2)
            return true;

        else if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            System.out.println(Math.sqrt(n)+" "+i);
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (prime(n))
            System.out.println(n + " is a prime number. ");
        else
            System.out.println(n + " is not a prime number. ");
    }
}

