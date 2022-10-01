package com.oopstopics2;


import com.oopsconcept.ThiskeyWord;

public class ThisKeyWord {
    static class NewClass{

    }
    int rollNo =10;
    int age = 25;
    double fees = 125.50;

    ThisKeyWord(int rollNo, double fees){
        this.rollNo = rollNo;
        this.fees= fees;
        System.out.println("Roll no: "+ rollNo+ " Fees: "+fees);
    }



    public static void main(String[] args) {
        ThisKeyWord key = new ThisKeyWord(2,225.90);
        System.out.println(key.age);
    }
}

