package com.assignmentDay5;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double t = scn.nextDouble();
        System.out.println("Enter the wind speed: ");
        double v = scn.nextDouble();
        if (t > 50 || v > 120 || v < 3) {
            System.out.println("invalid");
        } else {
            double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * (Math.pow(v, 0.16));
            System.out.println("The wind chill is: " + w);
        }
    }
}