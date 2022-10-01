package com.basicpracticeproblem;

import java.util.Scanner;



public class PatternDesign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pattern(a);

    }

    public static void pattern(int a) {

        for (int i =1;i<=a;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }System.out.println();
        }
    }




    }

