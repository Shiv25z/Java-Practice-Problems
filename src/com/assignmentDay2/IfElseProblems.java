package com.assignmentDay2;

import java.util.Scanner;

public class IfElseProblems {
    public static void main(String[] args) {
        System.out.println("Enter a number in range 1 - 5:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==1){
            System.out.print("You entered : One");
        } else if (n==2) {
            System.out.print("You entered : Two");
        }
        else if (n==3) {
            System.out.print("You entered : Three");
        }
        else if (n==4) {
            System.out.print("You entered : Four");
        }
        else if (n==5) {
            System.out.print("You entered : Five");
        }else{
            System.out.println("Enter a Number in Range mentioned");
        }
    }
}
