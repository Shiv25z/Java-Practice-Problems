package com.assignmentDay2;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reverse =0;
        for(;n!=0;){
            int r = 0;
            r = n%10;
            reverse = reverse*10 + r;
            n = n/10;
        }
        System.out.println("Reverse of entered integer: "+reverse);
    }
}
