//Avishek Pandey ap9sa
//CS 1010
//Problem Set 9
//April 2, 2019

import java.util.Scanner;

public class A9_ap9sa_Avishek_Pandey_complete {
    public static void main(String[] args) {
        String color = "";
        String slenderOrFat = "";
        String usedOrNew = "";
        String outputGood = "It's me! It's me! It's me!";
        String outputBad = "Oh shucks";

        Scanner in = new Scanner(System.in);

        System.out.println("What color?");
        color = in.next();

        System.out.println("Slender or Fat?");
        slenderOrFat = in.next();

        System.out.println("Used or New?");
        usedOrNew = in.next();

        if (color.equals("White") && slenderOrFat.equals("Fat") && usedOrNew.equals("Used")) {
            System.out.println(outputGood);
        } else {
            System.out.println(outputBad);
        }

    }
}
