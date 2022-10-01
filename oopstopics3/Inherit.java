package com.oopstopics3;

public class Inherit {
//
}

class Animals{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animals{// Child class of Animals
        void bark(){System.out.println("barking...");}
    }
class Cat extends Animals{
        void meow(){System.out.println("meowing...");}
    }
class TestInherit{
        public static void main(String args[]){
            Cat c=new Cat();
            c.meow();
            c.eat();
            //c.bark();
            // only parent class properties can be inherited not of the same level class
            // those properties can be used by calling particular class
        }

}

