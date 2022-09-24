package com.assignmentDay6;

import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of coupons:");
        int n = scn.nextInt();
        char[] s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();


        for (int i = 0; i < n; i++) {
            int max = 999999999;
            int random = (int) (Math.random() * max);
            StringBuffer sb = new StringBuffer();
            while (random > 0) {
                sb.append(s[random % s.length]);
                random /= s.length;
            }

            String CouponCode = sb.toString();
            System.out.println("Coupon Code: " + CouponCode);
        }
    }
}

