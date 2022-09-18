package com.assignmentDay3;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 20, 45, 20, 2, 56, 4, 0, 20, 12, 99, 10};
        int i;
        System.out.println("Elements at Even position are:");// Elements present at even position
        for (i = 0; i < arr.length; i = i + 2) {

            System.out.print(+arr[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Elements at Odd position are: ");// Elements present at odd position
        for (i = 1; i < arr.length; i = i + 2) {

            System.out.print(+arr[i] + " ");
        }


        System.out.println("");
        System.out.println("");



    }
}
