import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Chase Cutshall
 */
public class ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String principle;
        System.out.print(" What is the principle? ");

        principle = input.next();

        Integer a = Integer.parseInt(principle);

        String interestrate;
        System.out.print(" What is the rate of interest? ");

        interestrate = input.next();

        Double b = Double.parseDouble(interestrate);


        String years;
        System.out.print(" How long is the interest accrued for? ");

        years = input.next();

        Integer c = Integer.parseInt(years);

        double interest = b / 100;
        double amount = Math.round(a*(1 + interest * c) * 100d) / 100d;

        System.out.print("After " +c+ " years at " + interest + "% the investment will be worth $" + amount);
    }
}