/**
 * Avishek Pandey ap9sa
 * CS 1010
 * April 1, 2019
 * Problem Set 10
 */

import java.util.Scanner;

public class A10_ap9sa_Avishek_Pandey {
    public static void main(String[] args) {
        //Declaring variables
        int MAX_BEE_FLIGHT_UNITS = 5;
        int honeybeeWestEast = 0;
        int honeybeeNorthSouth = 0;
        int westEast = 0;
        int northSouth = 0;
        int cloverWestEast = (int) (-10 + Math.random() * ((10 - (-10) + 1)));
        int cloverNorthSouth = (int) (-10 + Math.random() * ((10 - (-10 + 1))));
        String output = "Beeboss commands all bees to fly to the clover field at (" + cloverWestEast + "," + cloverNorthSouth + ')';
        boolean cloverFound = false;
        boolean honeybeeLives = true;
        Scanner in = new Scanner(System.in); //Scanner for user input

        System.out.println(output); //prints the Beeboss command and location of clover

        while (cloverFound == false && honeybeeLives) {     //while loop for east/west coordinate
            System.out.println("Enter a East/West coordinate:");
            westEast = in.nextInt(); //gathers e/w coordinate


            System.out.println("Enter a North/South coordinate"); //gathers the n/s coordinate
            northSouth = in.nextInt();


            //If statement for checking whether bee dies for going over distance of 5
            if (Math.sqrt(Double.sum(westEast * westEast, northSouth * northSouth)) > MAX_BEE_FLIGHT_UNITS) {
                System.out.println("I failed...");
                honeybeeLives = false;
            } else {
                honeybeeWestEast = westEast + honeybeeWestEast;
                honeybeeNorthSouth = northSouth + honeybeeNorthSouth;
                System.out.println("Honeybee is at (" + honeybeeWestEast + "," + honeybeeNorthSouth + ")"); //reports location of bee

                if (honeybeeWestEast == cloverWestEast && honeybeeNorthSouth == cloverNorthSouth) { //sees if be location = clover location
                    System.out.println("I found the clover, THANK YOU!");
                    cloverFound = true;
                }
            }

        }

    }
}