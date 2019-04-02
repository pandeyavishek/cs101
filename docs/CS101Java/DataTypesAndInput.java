/**
Craig Dill cd9au
August 2015
This program demonstrates input and the Scanner object methods, data types and variables.
*/
import java.util.Scanner;
public class DataTypesAndInput
{
	public static void main(String[] args)
	{
		//Must ask for an input from keyboard object and name it (in is good name)
		Scanner in = new Scanner(System.in);
		
		//Must tell user what is wanted with a prompt.
		System.out.print("Please tell me your full name: ");
		
		//Get all the user's response using in, the input from keyboard object, and nextLine.
		String myName = in.nextLine();
		
		//The next prompt and input this time using nextInt because we asked for an integer.
		System.out.print("Please tell me how many inches tall you are: ");
		int height = in.nextInt();
		
		//Now get a decimal fraction using nextDouble and make sure accepting variable is correct.
		System.out.print("What is the value of the constant PI? ");
		double pi = in.nextDouble();
		
		//Looking for a single word next so can use next, but accepting variable must be String
		System.out.print("May I be so bold to ask your favorite color? ");
		String favColor = in.next();
		
		/**This next one is tricky.  The previous next grabbed the word response to
		the favorite color question, but did not get the enter key pressing by the user.
		This means that the enter key press after the user entered favorite color is
		still waiting to be input into the program.  This program does not want the enter
		key press, but it is there, so the program must remove it and then continue on
		gathering input from the user.  This "left over" enter key press problem only 
		occurs when nextLine is used after any of the next (next, nextInt, nextDouble)
		statements.
		*/
		String trash = in.nextLine();		//trash because do not want the enter key press.
		System.out.print("And finally, might you share your street address? ");
		String address = in.nextLine();	//get the address 
		int iq = (int)(Math.random() * 30 + 110);		

		String output = "\nYour full name is " + myName + " and favorite color is " + favColor +
							 ".\nYou live at " + address + ".  You are " + height / 12 + " feet " + 
							 height % 12 + " inches tall.\nThe value of PI is " + pi + ".\n" +
							 "Based upon your input, I calculate your IQ as " + iq + ".";
		
		System.out.println(output);
	}
}