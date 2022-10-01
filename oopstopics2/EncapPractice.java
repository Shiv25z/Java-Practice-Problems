package com.oopstopics2;

public class EncapPractice {
    public static void main(String[] args) {
        Encap obj = new Encap();
//        obj.data;
//        obj.msg;
        obj.setData(40);// Encapsulation can be achieved by using 2 methods only
        System.out.println(obj.getData());
        // In order to achieve encapsulation make the instance variables as private
        // Access those variables by using get and set method
    }
}

class Encap {


    private int data;
    private void msg(){
        System.out.println("Private message");

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
