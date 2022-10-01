package com.oopsconcept;
//
public class Vehicles {
    public static void main(String[] args) {
     //   Bikes bike = new Bikes();// you cannot call abstract class only extened classes you can call

   Bullet bullet = new Bullet();
   bullet.key();
   bullet.start();
    }


//    OopsPractice obj = new OopsPractice();
//    obj.setage(23);
//      System.out.println(obj.getAge());
//      obj.setSalary(50.00);
//      System.out.println(obj.getAge());
}

abstract class Bikes{
    abstract int key();
    abstract void start();// if class is abstract then its not mandatory to make methods abstract they
    // by default are considered as abstract method.
    // But if we make any method as abstract then we need to make class abstract as well
     }
class Bullet extends Bikes{
    @Override
    int key() {
        return 0;
    }
        @Override
    void start(){
        System.out.println(" Riding Bullet");

    }
}
