package com.assignmentDay3;

import java.util.Arrays;

public class AscendingOrderArray {
    public static void main(String[] args) {
        int[] arr = new int[] {9, 15, 101, 28, 11,60,53};
        int n = arr.length;

        Arrays.sort(arr);
        System.out.println("Sorted array in Ascending Order is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");


        }
    }
}
