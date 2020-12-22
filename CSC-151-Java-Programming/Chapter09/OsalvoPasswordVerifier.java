/**
 * 
 * @author 	Thaddeus Osalvo

 * Date		November 8, 2020
 * Purpose	To create a software package to allow users to enter their passwords with the following charactersitcs
 * 			Password has to be six characters long
 * 			Password should vontain at least one uppercase and at least one lowercase letter
 * 			Password should have at least one digit
 *
 */
import java.util.Scanner;
public class OsalvoPasswordVerifier {

	public static boolean verify(String pass) {
		
		// intialize boolean variables as flags
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;
		
		
		// password should be 6 char long
		if (pass.length() < 6) {
			return false;
		}
		
		// should contain at least one uppercase and at least one lowercase and at least one digit
		for (int i = 0; i < pass.length(); i++) {
			char currentChar = pass.charAt(i);
			
			// Checks if current char is lowercase
			if (Character.isLowerCase(currentChar)) {
				lower = true;
			}
			
			// Checks if current char is uppercase
			if (Character.isUpperCase(currentChar)) {
				upper = true;
			}
			
			// Checks if current char is a digit
			if (Character.isDigit(currentChar)) {
				digit = true;
			}	
		}
		// checks if all flags are true
		if ((lower && upper && digit) == true) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// asks user to enter a password for verification
		System.out.print("Enter password to be verified:");
		String input = keyboard.nextLine();
		
		// outputs verification results by calling method
		if (verify(input) == true) {
			System.out.println("Valid password");
		}
		else
			System.out.println("Invalid password");
		
		keyboard.close();
	}

}
