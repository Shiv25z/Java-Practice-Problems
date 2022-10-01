package com.oopsconcept;

public class Inheritance {// Inheritance means creating a child class using a keyword called "extends"
    String s;
    void cook(String s){
        System.out.println();
        System.out.println("Cooking :"+s);

    }

    public static void main(String[] args) {
//        Inheritance obj = new Inheritance();
//        obj.dishes();
//        obj.cook("Pavbhaji");
        Chef c = new Chef();//  child class inherits properties of it parent class
        c.dishes();
        c.cook("Aloo Mutter");

    }
}

class Chef extends Inheritance{// Child class of Inheritance

    void dishes(){
        System.out.println();
        System.out.println("Prepare ordered food");
    }
}

