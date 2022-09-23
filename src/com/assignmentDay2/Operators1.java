package com.assignmentDay2;

import java.util.Scanner;

public class Operators1 {
    static int max(int a,int b,  int c,int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }
     static int min(int a, int b, int c, int d) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;
        return min;
    }
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


        System.out.println("Max is " + max(w,x,y,z));
        System.out.println("Min is " + min(w,x,y,z));


    }
}
