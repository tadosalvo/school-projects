/**
 * 
 * @author	Thaddeus Osalvo
 *	Date 	October 4, 2020
 *	Purpose To write a method to display the character in a given index position on a string.
 *
 */
import java.util.Scanner;
public class OsalvoMethod_showChar {

	public static void main(String[] args) {
		
		// Local Variables
		Scanner keyboard = new Scanner(System.in);
		int index;
		String input;
		
		// Displays and asks user to enter a line of text
		System.out.print("Enter a line of text: ");
		input = keyboard.nextLine();
		
		// Displays and asks user to enter an index
		System.out.print("Enter your index: ");
		index = keyboard.nextInt();
		
		// Calling showChar method
		showChar(input, index);
		
		// Close keyboard
		keyboard.close();

	}
	
	public static void showChar(String input, int index) {
		
		// Prints out the char at designated index
		System.out.println(input.charAt(index));
		
	}

}
