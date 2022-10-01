package com.oopsconcept;

public class OopsPractice {
// object is an entity that has state and behaviour
// class is a collection of objects
    String name = "Shivam";
    private int age = 23;
    private double salary = 152.00;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    void details(int age, String name, double salary) {// methods are small part of snippet that we can
        System.out.println("Details of employee");
        System.out.println("Name: "+name );
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

    void person(){
        System.out.println("Details of person");
        System.out.println("name: "+name);
        System.out.println("age: "+age);


    }

    public static void main(String[] args) {

        OopsPractice obj = new OopsPractice();
        obj.person();
        System.out.println();
        obj.details(30,"Gaurav",100.0);
       // Overriding or run time compilation
        Polymorphism poly = new Polymorphism();
        poly.fun("Hello");

//      OopsPractice obj = new OopsPractice(); // class values are accessible within class
        obj.setAge(23);// accessing values using getter and setter
        System.out.println(obj.getAge());
        obj.setSalary(50.00);
        System.out.println(obj.getAge());


    }

}
