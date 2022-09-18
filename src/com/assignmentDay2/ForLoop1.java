package com.assignmentDay2;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0;i<=n;++i){
            sum =sum+i;

        }
        System.out.println("Sum of Natural Number is: "+sum);
    }
}
