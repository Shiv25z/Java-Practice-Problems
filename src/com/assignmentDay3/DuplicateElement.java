package com.assignmentDay3;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {12, 20, 45, 20, 2, 56, 4, 0, 12, 99, 10, 45};
        int i;
        for(i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
