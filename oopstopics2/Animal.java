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


    }
}

class Cat extends Animal{

    void run(int n){
        super.eat("Fish");// super to invoke parent class method.
        System.out.println("Runs on "+n);
    }
    void eat(String s){
        System.out.println(" Cat Eats :"+s);
    }
     Cat(int a){
        super();// super to call parent constructor
         System.out.println("Cat Class is created" +a);
     }
}
