package com.assignmentDay5;

public class PowerProblem {
    public static void main(String args[]) {
    int n = Integer.parseInt(args[0]);
    double power =0;
    try {
        if (n>=0 && n<=31){
            for (int i=0;i<=n;i++){
                power = power + Math.pow(2, i);

            }
            System.out.println(power);
        }
        else{
            System.out.println(" Enter valid power input less or equal to 31.");
        }}
        catch (NumberFormatException e){
            System.out.println("Invalid integer entered in command line "+e);
        }

    }



    }

