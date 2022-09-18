package com.assignmentDay2;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number in range of 1 - 12 : ");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Number: "+n+" Month: January");
                break;
            case 2:
                System.out.println("Number: "+n+" Month: February");
                break;
            case 3:
                System.out.println("Number: "+n+" Month: March");
                break;
            case 4:
                System.out.println("Number: "+n+" Month: April");
                break;
            case 5:
                System.out.println("Number: "+n+" Month: May");
                break;
            case 6:
                System.out.println("Number: "+n+" Month: June");
                break;
            case 7:
                System.out.println("Number: "+n+" Month: July");
                break;
            case 8:
                System.out.println("Number: "+n+" Month: August");
                break;
            case 9:
                System.out.println("Number: "+n+" Month: September");
                break;
            case 10:
                System.out.println("Number: "+n+" Month: October");
                break;
            case 11:
                System.out.println("Number: "+n+" Month: November");
                break;
            case 12:
                System.out.println("Number: "+n+" Month: December");
                break;
            default :
                System.out.println("Enter valid number in range of 1 - 12!");



        }
    }
}
