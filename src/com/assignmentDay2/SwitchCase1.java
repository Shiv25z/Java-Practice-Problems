package com.assignmentDay2;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        char b = Character.toLowerCase(c);
        switch (b){
            case 'a':
                System.out.println("'A' is a vowel");
                break;
            case 'e':
                System.out.println("'E' is a vowel");
                break;
            case 'i':
                System.out.println("'I' is a vowel");
                break;
            case 'o':
                System.out.println("'O' is a vowel");
                break;
            case 'u':
                System.out.println("'U' is a vowel");
                break;
            default:
                System.out.println("Entered character is a Consonant ");
        }
    }
}
