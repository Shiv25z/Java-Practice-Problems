package com.assignmentDay5;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        char b = Character.toLowerCase(c);
        switch (b) {
            case 'a' -> System.out.println("'A' is a vowel");
            case 'e' -> System.out.println("'E' is a vowel");
            case 'i' -> System.out.println("'I' is a vowel");
            case 'o' -> System.out.println("'O' is a vowel");
            case 'u' -> System.out.println("'U' is a vowel");
            default -> System.out.println("Entered character is a Consonant ");
        }
    }
}
