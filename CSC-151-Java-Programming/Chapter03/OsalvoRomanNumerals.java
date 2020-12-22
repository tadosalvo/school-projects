/**
 * 
 * @author	Thaddeus Osalvo
 *	Date 	September, 20 2020
 *	Purpose Convert input number 1-10 to the Roman numeral version of that number
 */
import java.util.Scanner;
public class OsalvoRomanNumerals {

	public static void main(String[] args) {
		
		// Local variables
		Scanner keyboard = new Scanner (System.in);
		int number;
		
		// Ask student for a number between 1-10
		System.out.print("Enter a number in the range of 1 - 10: ");
		number = keyboard.nextInt();
		
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
		case 6:
			System.out.println("VI");
			break;
		case 7:
			System.out.println("VII");
			break;
		case 8:
			System.out.println("VIII");
			break;
		case 9:
			System.out.println("IX");
			break;
		case 10:
			System.out.println("X");
			break;
		default:
			System.out.println("Error: cannot process " + number);
		}
		keyboard.close();
	}
}
