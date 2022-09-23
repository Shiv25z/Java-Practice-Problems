package com.assignmentDay5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HarmonicProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter N to find harmonic value: ");
        int n = sc.nextInt();
        double result = 0.0;

        for ( int i =0; i<=n;i++){
            result = result +(double) 1/n;
            n--;
        }
        System.out.println(result);
    }
}
