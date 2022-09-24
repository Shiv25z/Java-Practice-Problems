package com.assignmentDay5;

import java.util.Scanner;

public class Distance {
    public static double distance(double x, double y){
        double dis = Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)));
        System.out.println("Euclidean Distance = ");
        return dis;
    }

    public static void main(String[] args) {
       double x,y;
       x= Double.parseDouble(args[0]);
       y = Double.parseDouble(args[1]);
        distance(x,y);
    }
}
