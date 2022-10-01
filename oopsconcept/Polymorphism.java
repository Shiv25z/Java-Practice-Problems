package com.oopsconcept;

public class Polymorphism {// Polymorphism means having 2 or more methods/functions with same name
   void fun(){                                              //   ---->> 1
        System.out.println(" Having fun in park");
    }

    void fun(String s){                                     // -------->> 2
        System.out.println("Have fun in mall "+s);
        System.out.println(s+" Mazze kar park mein!");
    }

    // This is also known as method overloading. Means havinf 2 methods with same name in the same class but
    // having different sets of parameters

    public static void main(String[] args) {
       NewPoly obj = new NewPoly();
       obj.fun();
       // Here we achieve method overriding. As you can see there are 2 methods with same name
        // this decides on the basis of run time compilation to which method to call

    }
}

class NewPoly extends Polymorphism{


    void fun(){
        System.out.println(" Riding bike is fun");
    }
}
