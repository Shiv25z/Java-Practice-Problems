package com.basicpracticeproblem;

import java.util.Scanner;

public class PatternDesign2 {
    static void pattern(int row, int col){

        for(int i=1;i<=col;i++){
            for(int j=1;j<=row;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        pattern(row,col);
    }
}
