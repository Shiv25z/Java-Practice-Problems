package com.assignmentday11_12;

import java.util.Scanner;

public class AccountTest {

    double balance;
    AccountTest(double balance){
        this.balance = balance;

    }

    void debit(double debitAmount){
        if(debitAmount<balance){
            balance -=debitAmount;
            System.out.println(debitAmount+" rs has been debited from your Account ");
            System.out.println("Remaining Account Balance is: "+balance);
        }
        else {
            System.out.println("Entered Amount is greater that Account Balance!");
            System.out.println("Transaction Cancelled");
            System.out.println("Remaining Account Balance is: "+balance);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Balance: ");
        double balance = sc.nextDouble();
        AccountTest account = new AccountTest(balance);
        System.out.println("Enter Amount to be debited: ");

        account.debit(sc.nextDouble());
    }
}
