package com.assignmentDay5;

import java.util.Scanner;

public class Quadratic {
    static void calculateRoots(double a, double b, double c) {
       double root1,root2;
        double d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println("Roots are real and distinct roots");

            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.format("Root1 =" +root1+ "and Root2 = "+root2);
        }

        else if (d == 0) {
            System.out.println("Roots are real and equal roots");

            root1 = root2 = -b / (2 * a);
            System.out.format("Root1 =" +root1+ "and Root2 = "+root2);
        }


        else {
            System.out.println("Roots are complex number and distinct");

            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.format("Root1: Real = "+real+" Imaginary = "+imaginary);
            System.out.format("Root2: Real = "+real+" Imaginary = "+imaginary);
        }
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of a,b and c");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        calculateRoots(a, b, c);
    }
}
