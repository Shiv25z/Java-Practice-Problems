package com.oopstopics3;

public class EncapsulationOops3 {
    private static int age;
    private static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        System.out.println(age); // private variables and methods are accessible inside the class

        sum(9,39);

        A obj = new A();
        //obj.a;// private variables are not accessible of other class. Hence encapsulation is achieved
        obj.setA(9);// Other class private variables can be accessed by using get/set method
        System.out.println(obj.getA());
        System.out.println(obj.hashCode());


    }
}

class A{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private void mul(int a, int b){
        System.out.println(a*b);
    }

}
