package com.assignmentDay2;

import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        int w = a+b*c;
        int x = c+a/b;
        int y = a%b+c;
        int z = a*b+c;

        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
