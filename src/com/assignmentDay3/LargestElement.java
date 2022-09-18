package com.assignmentDay3;


import java.util.Arrays;

import static java.util.Collections.reverse;

public class LargestElement {
        public static void main(String[] args) {
            int[] arr = new int[] {9, 15, 101, 28, 11,60,53};
            int n = arr.length;

            Arrays.sort(arr);

            System.out.println("Smallest element is : "+arr[0]);// prints the smallest element in the array
            System.out.println("Largest Element is : "+arr[n-1]);// prints the Largest element in the array
            System.out.println("Second Largest element is : "+arr[n-2]);// prints the second largest element in the array




            }
        }

