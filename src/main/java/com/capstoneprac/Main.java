package com.capstoneprac;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner calc2 = new Scanner(System.in);
        System.out.println("Please enter the deposit amount here : ");
        double depositAmount = calc2.nextDouble();
        System.out.println("Please enter the annual interest rate here : ");
        double annualInterestRate = calc2.nextDouble();
        System.out.println("Please enter the years to mature rate here : ");
        int yearsToMature = calc2.nextInt();

//        FV = P × (1 + (r / d))^n

        futureValue(depositAmount,annualInterestRate, yearsToMature);

        //total interest = FV - P

        totalInterest (depositAmount, annualInterestRate , yearsToMature);

        System.out.println( " This is your future value " + "$" + futureValue(annualInterestRate, depositAmount, yearsToMature));
        System.out.println( " This is your total interest " + "%" + totalInterest(depositAmount, annualInterestRate, yearsToMature));
    }

    public static double futureValue( double annualInterestRate , double depositAmount, int yearsToMature)
    {  return depositAmount * Math.pow(1 + (annualInterestRate/100.0) / 365, yearsToMature * 365);}

    public static double totalInterest(double depositAmount , double annualInterestRate, int yearsToMature) {
        return  futureValue(depositAmount, annualInterestRate, yearsToMature) - depositAmount;}

    }





