package com.oopstopics2;


import com.oopsconcept.ThiskeyWord;

public class ThisKeyWord {
    ThisKeyWord(){
        System.out.println("Explained the Use of this keyword!!");
        System.out.println();
    }
    int rollNo =10;
    int age = 25;
    double fees = 125.50;

    void m(){
        System.out.println("Created a method named : m " );
    }

    void n(){
        this.m();// using this keyword to invoke the current class method
        System.out.println(" Created method : n ");
    }
    ThisKeyWord(int rollNo, double fees){
        this();// invoked ThisKeyWord Constructor
        this.rollNo = rollNo; // creating a reference to instance variables
        this.fees= fees;
        System.out.println("Roll no: "+ rollNo+ " Fees: "+fees);
    }



    public static void main(String[] args) {
        ThisKeyWord key = new ThisKeyWord(2,225.90);
        System.out.println(key.age);

        key.n();

        NewThis obj = new NewThis();
        obj.cnn();
    }
}

class NewThis extends ThisKeyWord{

    void anz(NewThis obj){
        System.out.println("NewThis Object created");

    }

    void cnn(){
        anz(this);// using this keyword to pass as an arguement
        System.out.println("Cnn created");
    }


}