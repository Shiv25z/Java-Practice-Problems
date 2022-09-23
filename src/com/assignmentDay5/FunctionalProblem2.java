package com.assignmentDay5;


import java.util.Scanner;

public class FunctionalProblem2 {
    static void findTriplets(int[] arr, int n)
    {
        int count = 0;
        boolean bool = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i]+ " " +arr[j]+ " " +arr[k]);
                        bool = true;
                        count++;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("number of distinct triplets:" + count);


        if (bool == false)
            System.out.println("Triplets does not exist ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inputs:");
        int a = sc.nextInt();
        int arr[] = new int [a];
        int n = arr.length;
        System.out.println("Enter the elements of an array");
        for (int i = 0; i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of array is");
        for (int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        System.out.println("distinct triplets are");

        findTriplets(arr, n);
    }
}
