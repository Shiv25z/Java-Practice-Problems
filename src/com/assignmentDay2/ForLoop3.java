package com.assignmentDay2;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int n = number;
        int reversenum =0;
        for(;number!=0;){
            int r = 0;
            r = number%10;
            reversenum = reversenum*10 + r;
            number = number/10;
        }
        System.out.println("Reverse of entered integer: "+reversenum);

        System.out.println("");

        if (n==reversenum){
            System.out.println("The entered number is a palindrome!");
        }
        else{
            System.out.println("The entered number is not a palindrome. ");
        }
    }
}
