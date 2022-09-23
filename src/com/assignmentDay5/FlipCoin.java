package com.assignmentDay5;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of times to flip a coin: ");
        int coin = sc.nextInt();
        int headcount=0;
        int tailcount=0;

        for (int i =0; i< coin; i++){
            float flip = random.nextFloat(0,1);
            if(flip<0.5){
                System.out.println("Heads!");
                headcount++;
            }else{
                System.out.println("Tails");
                tailcount++;
            }
        }

        System.out.println("Total Heads : "+headcount);
        System.out.println("Total Tails : "+tailcount);
        int tailpercent = tailcount % coin * 10;

        int headpercent = 100 - tailpercent;

        System.out.println("Heads Percentage: "+headpercent+"%");
        System.out.println("Tails Percentage: "+tailpercent+"%");
    }
}
