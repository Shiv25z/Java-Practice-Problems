package com.oopstopics2;

public class Polymorphism {
    static double a;
    static double b;


    static void add(int a, int b) {
        System.out.println(a+b);
    }

    static void add(double a, double b) {
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        add(2,4);
    }

}