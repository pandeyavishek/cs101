/**
 * Avishek Pandey ap9sa
 * CS 1010
 * April 1, 2019
 * Problem Set 10
 */

import java.util.Scanner;

public class A11_ap9sa_Avishek_Pandey {
    public static void main(String[] args) {
        //Declaring variables
        double INITAL_AMOUNT = 1000.0;
        double input = 0.0;
        double interestRate = 0.0;
        double amount = 0.0;
        int interestPercent = 0;
        int year = 0;
        int yearsToDouble = 0;
        Scanner in = new Scanner(System.in); //Scanner for user input

        System.out.println("Enter interest percent as INTEGER between 1 & 72 inclusive:");
        input = in.nextInt();

        while (input < 1 || input > 72) { //greater 72 or less than 1 get changed
            System.out.println("Percent interest must be INTEGER between 1 & 72 inclusive!");
            System.out.println("Enter interest percentage as INTEGER between 1 & 72 inclusive:");
            input = in.nextInt();
        }

        interestRate = input / 100;
        amount = INITAL_AMOUNT;

        while (amount < 2 * INITAL_AMOUNT) {// idk what to do here

            year++;
            amount += amount * interestRate;
        }

        System.out.println("Enter years for investment to double as INTEGER between 1 & 72:");
        input = in.nextInt();

        while (input < 1 || input > 72) { //greater 72 or less than 1 get changed
            System.out.println("Years input must be between 1 and 72 inclusive!");
            System.out.println("Enter years for investment to double as INTEGER between 1 & 72:");
            input = in.nextInt();
        }

        yearsToDouble = (int) input;
        amount = INITAL_AMOUNT;
        interestRate = 0.0;

        while (amount < 2 * INITAL_AMOUNT) {

        }

    }
}