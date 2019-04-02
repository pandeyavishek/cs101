/**
CS 1010
August 2015
This program demonstrates operations including String concatenation, PEMDAS,
remainder, power, square root, random and boolean.
*/
public class Operations
{
	public static void main(String[] args)
	{
		System.out.println("4 + 6 is " + 4 + 6 );
		System.out.println("4 + 6 / 2 is " + 4 + 6 / 2);
		System.out.println("4 + 6 / 2 is " + (4 + 6 / 2));
		System.out.println("1 / 2 is " + 1 / 2);
		System.out.println("9 / 2 is " + 9 / 2);
      System.out.println("9.0 / 2 is " + 9.0 / 2);
		System.out.println("8 % 4 is " + 8 % 4);
		System.out.println("10 + 8 / (2 * 2) - 11 is " + (10 + 8 / (2 * 2)- 11));
		System.out.println(Math.pow(3,2));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.random());
		System.out.println((int)(Math.random()* 10 + 1));
		System.out.println( (3 < 4) + " " + (3 > 4) + " " + (3 == 4) + " " + (3 != 4));
	}
}