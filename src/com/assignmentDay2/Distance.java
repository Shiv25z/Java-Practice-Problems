package com.assignmentDay2;

public class Distance {
    public static int distance( int a, int b){
        int form= (int) Math.sqrt(Math.pow(a,2)+(Math.pow(b,2)));;
        System.out.println("Euclidean Distance: = ");
        return form;
    }

    public static void main(String[] args) {
        int x,y;
        x=Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        distance(x,y);
    }
}
