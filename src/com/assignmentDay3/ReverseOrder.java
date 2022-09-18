package com.assignmentDay3;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] arr = {12, 20, 45, 20, 2, 56, 4, 0, 20, 12, 99, 10};
        int i;
        System.out.println("Elements in reverse order: ");// Elements sorted in reverse order
        for(i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
