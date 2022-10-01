package com.oopstopics2;

public class Animal {
    int m =4;
    Animal(){
        System.out.println(" All Animals are binod");
    }
    void eat(String s){
        System.out.println("Eats : "+s);
    }

    public static void main(String[] args) {
        Cat obj = new Cat(5);
        obj.run(4);
        obj.

    }
}

class Cat extends Animal{

    void run(int n){
        super.eat("Fish");
        System.out.println("Runs on "+n);
    }
    void eat(String s){
        System.out.println(" Cat Eats :"+s);
    }
     Cat(int a){
        super();
         System.out.println("Cat Class is created" +a);
     }
}
