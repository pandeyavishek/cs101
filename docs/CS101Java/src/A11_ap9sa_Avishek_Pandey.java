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


    }
}
