/**
 * 
 * @author	Thaddeus Osalvo
 *	Date 	August 31, 2020
 *	Purpose To ask the user to input information and display
 *			name, age, income.
 */

import java.util.Scanner;

public class OsalvoUserInput {

	public static void main(String[] args) {
		// Local variables
		
		String myName;
		int myAge, futureAge;
		double monthlyIncome, annualSalary;
		
		// Create Scanner object to read input from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Ask for the user's name
		System.out.print("What is your name? ");
		myName = keyboard.nextLine();
		
		// Ask for the user's age
		System.out.print("How old are you?");
		myAge = keyboard.nextInt();
		
		// Ask for the user's monthly income
		System.out.print("Tell me how much you make in a month: $");
		monthlyIncome = keyboard.nextDouble();
		
		// Calculate future age
		futureAge = myAge + 10;
		
		
		// Calculate annual salary
		annualSalary = monthlyIncome * 12;
		
		// Display user information to the console
		System.out.println("Welcome " + myName + "!!");
		System.out.println("You are " + myAge + " years old.");
		System.out.println("You make $" + monthlyIncome + " per month.");
		System.out.println("You will be " + futureAge + " in 10 years.");
		System.out.println("You make $" + annualSalary + " per year.");
		
		// Close the Scanner object
		keyboard.close();
	}

}
