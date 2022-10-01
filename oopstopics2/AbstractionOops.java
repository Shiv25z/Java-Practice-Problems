package com.oopstopics2;
class AbstractionOops{

}

abstract class Bike{

    Bike(){
        System.out.println("Bike Rides are Fun!");
    }
    abstract void run();// when we make a method as abstract, the class needs to made abstract as well

    void speed(){// if the class is abstract then no compulsion on making the class as abstract
        System.out.println("Speed is of 100kmph");
    }
}
class Honda4 extends Bike{
    void run(){
        System.out.println(" Honda 4 ride is safe");
    }


}

class TestDrive{
    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
        obj.speed();// partial abstraction


        }

    }

