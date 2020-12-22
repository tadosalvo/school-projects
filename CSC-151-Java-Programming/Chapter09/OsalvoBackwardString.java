/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 8, 2020
 * Purpose	To display a string backwards using a method
 *
 */
import java.util.Scanner;
public class OsalvoBackwardString {

	// Method that reverses string
	public static StringBuilder backward(String input) {
		
		// local variables
		int index, length;
		length = input.length();
		
		// Creates stringbuilder object that holds the length of characters
		StringBuilder x = new StringBuilder(length);
		
		// Loops through string backwards and appends on stringbuilder object
		for (index = (length - 1); index >= 0; index--) {
			x.append(input.charAt(index));
		}
		
		return x;
	}
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		// Asks user to enter a string
		System.out.print("Enter a string:");
		
		String input =  keyboard.nextLine();
		
		// Outputs reversed string
		System.out.println(backward(input));
		
		keyboard.close();
	}

}
