/**
 * 
 * @author	Thaddeus Osalvo
 *	Date 	September 8, 2020
 *	Purpose Lets user input number of cookies ate and calculates total calories consumed
 */

// imports Scanner class to allow input
import java.util.Scanner;

public class OsalvoCookieCalorieCounter {
	
	public static void main(String[] args) {
		
		// Declares constants using final key word
		final int COOKIES_IN_BAG = 40, SERVINGS_PER_BAG = 10, SERVING_CALORIES = 300;
		
		// Declares and initializes number of cookies and the total calorie intake
		int numberOfCookies = 0, calorieIntake = 0;
		
		// Declares and initializes calorie per cookie
		int caloriePerCookie = 0;
		
		// Creates Scanner object that reads input from keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Displays number of cookies eaten and allows user to input number of cookies
		System.out.print("Enter number of cookies eaten: ");
		numberOfCookies = keyboard.nextInt();
		
		// Calculates calorie per cookie
		caloriePerCookie = (SERVINGS_PER_BAG * SERVING_CALORIES) / COOKIES_IN_BAG;
		
		// Calculates total calorie intake by multiplying number of cookies by calorie per cookie
		calorieIntake = numberOfCookies * caloriePerCookie;
		
		// Displays calorie intake
		System.out.println("Your calorie intake was: " + calorieIntake + " calories.");
		
		// Close the Scanner object
		keyboard.close();	
	}

}
