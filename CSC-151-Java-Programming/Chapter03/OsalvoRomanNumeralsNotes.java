/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		September 14, 2020
 * Purpose	To display the Roman Numeral equivalent of a number
 *
 */
import java.util.Scanner;
public class OsalvoRomanNumeralsNotes {

	public static void main(String[] args) {
		// Local variables
		Scanner keyboard = new Scanner (System.in);
		int number;
		
		// Ask student for a number between 1-5
		System.out.print("Enter a number between 1-5: ");
		number = keyboard.nextInt();
		
		//Display number
		System.out.println("Your number is " + number);
		
		// Display Roman numeral for the given number
		//I II III IV V
		if (number == 1) {
			System.out.println("I");
		}
		else if (number == 2) {
			System.out.println("II");
		}
		else if (number == 3) {
			System.out.println("III");
		}
		else if (number == 4) {
			System.out.println("IV");
		}
		else if (number == 5) {
			System.out.println("V");
		}
		else {
			System.out.println("Error: cannot process " + number);
		}
		
		// Display Roman numeral for the given number using switch statement
		// I II III IV V
		switch (number) {
		case 1:
			System.out.println("I");
			break;
		case 2:
			System.out.println("II");
			break;
		case 3:
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5:
			System.out.println("V");
			break;
		default:
			System.out.println("Error: cannot process " + number);
		}
		keyboard.close();

	}

}
