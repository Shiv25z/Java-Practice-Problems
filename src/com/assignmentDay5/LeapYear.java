package com.assignmentDay5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if (year >=1000 && year <= 9999){
            if ((year%400 ==0 || year%100 !=0) && year%4==0){
                System.out.println(year+" is a Leap year.");
            }
            else{
                System.out.println(year+" is not a Leap year.");
            }
        }else{
            System.out.println("Enter a year within 1000 & 9999 to check if it is a Leap year. ");
        }
    }
}
