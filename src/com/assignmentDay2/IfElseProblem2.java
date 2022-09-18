package com.assignmentDay2;

import java.util.Scanner;

public class IfElseProblem2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number to Display its unit : ");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Unit");
        } else if (n>=10&&n<=99) {
            System.out.println("Tens");
        }else if (n>=100&&n<=999) {
            System.out.println("Hundred");
        }else if (n>=1000&&n<=9999) {
            System.out.println("Thousands");
        }else if (n>=10000&&n<=99999) {
            System.out.println("Ten Thousands");
        }
        else{
            System.out.println("Number is too great to calculate number of zeros");
        }
    }
}
