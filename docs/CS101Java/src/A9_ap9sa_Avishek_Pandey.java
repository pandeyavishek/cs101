//Avishek Pandey ap9sa
//CS 1010
//April 1, 2019
//Problem Set 9

import java.util.Scanner;

public class A9_ap9sa_Avishek_Pandey {
    public static void main(String[] args) {

        int MAX_BEE_FLIGHT_UNITS = 5;
        int honeybeeWestEast = 0;
        int honeybeeNorthSouth = 0;
        int westEast = 0;
        int northSouth = 0;
        int cloverWestEast = (int) (-10 + Math.random() * ((10-(-10)+1)));
        int cloverNorthSouth = (int) (-10 + Math.random() * ((10-(-10+1))));
        String output = "Beeboss commands all bees to fly to the clover field at ("+cloverWestEast + "," + cloverNorthSouth + ')';
        boolean cloverFound = false;
        boolean honeybeeLives = true;

        Scanner in  = new Scanner(System.in);

        System.out.println(cloverWestEast);

        System.out.println("Enter a East/West coordinate:");
        westEast = in.nextInt();
        //System.out.println(westEast);

        System.out.print("Enter a North/South coordinate:");
        northSouth = in.nextInt();

    }


}
