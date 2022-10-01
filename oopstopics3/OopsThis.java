package com.oopstopics3;

public class OopsThis {
    int a;

    @Override
    public String toString() {
        return "OopsThis{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    String b ;

    static void printer(String b, int a) {
        int i=0;
        while ( i!=a){
            System.out.println("Entered String : " + b);
            i++;
        }
    }


    public static void main(String[] args) {
        OopsThis obj = new OopsThis();
        printer("Hello Im Binod!",5);
        System.out.println(obj.toString());

    }
}