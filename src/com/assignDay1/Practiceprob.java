package com.assignmentDay1;


public class Practiceprob {

    static int a ;// Static variables declared which are represented with static keyword
    static double b ;// Static variables declared which are represented with static keyword
    static long x ;// Static variables declared which are represented with static keyword
    static byte l ;// Static variables declared which are represented with static keyword
    static String c;// Static variables declared which are represented with static keyword
    static boolean m;// Static variables declared which are represented with static keyword


    public static void main(String[] args) {
        System.out.println(" Welcome to JAVA programming!!!"); // Display a message

        System.out.println("Static int default variable: "+a);// Static variable default value
        System.out.println("Static double default variable: "+b);// Static variable default value
        System.out.println("Static long default variable: "+x);// Static variable default value
        System.out.println("Static byte default variable: "+l);// Static variable default value
        System.out.println("Static String default variable: "+c);// Static variable default value
        System.out.println("Static Boolean default variable: "+m);// Static variable default value


        String s1 = "abcabc";// Two string comparison problem
        String s2 = "abcabc";

        if (s1 == s2){
            System.out.println("Strings are same");
        }
        else{
            System.out.println("Strings are not same");
        }


    }
}
