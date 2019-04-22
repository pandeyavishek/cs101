/**
 * Avishek Pandey ap9sa
 * CS 1010
 * April 22, 2019
 * Problem Set 11
 */

import java.text.DecimalFormat;
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
/**
 * Calculating doubling time
 */
        System.out.println("Enter interest percent as INTEGER between 1 & 72 inclusive:");
        input = in.nextInt(); //Takes user input

        while (input < 1 || input > 72) { //greater 72 or less than 1 get changed
            System.out.println("Percent interest must be INTEGER between 1 & 72 inclusive!");
            System.out.println("Enter interest percentage as INTEGER between 1 & 72 inclusive:");
            input = in.nextInt();
        }

        interestRate = input / 100;
        amount = INITAL_AMOUNT;


        while (amount < 2 * INITAL_AMOUNT) {

            year++;
            amount += amount * interestRate;
        }


        System.out.println("The investment doubles in " + (year - 1) + " to " + year + " year(s).");

/**
 * Calculating interest given a certain doubling time
 */
        DecimalFormat value = new DecimalFormat("#.#"); //formats decimal output
        year = 0;
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
            amount = INITAL_AMOUNT;
            interestRate += .001;

            for (year = 0; year < yearsToDouble; year++) {
                amount += amount * interestRate;
            }
        }
        //math for interest rate
        interestRate = interestRate * 1000;
        interestRate = interestRate / 10;

        System.out.println("An interest rate of " + value.format(interestRate) + "% will double the investment in " + (int) input + " years.");
    }
}