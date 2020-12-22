/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 8, 2020
 * Purpose	Asks user to enter numbers separated by commas and to sum all numbers
 *
 */
import java.util.Scanner;
public class OsalvoNumberSum {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		// Local variables
		int sum = 0, i;
		String num;
		
		// Asks user to enter numbers
		System.out.print("Enter numbers separated by commas:");
		num = keyboard.nextLine();
		
		keyboard.close();
		
		// calls the split method to split the delimiter comma
		String[] numSplit = num.split(",");
		
		// Loops over String array
		for (i = 0; i < numSplit.length; i++) {
			
			// Used the Integer.parse method to convert String to int
			sum += Integer.parseInt(numSplit[i]);
		}
		
		// Outputs total
		System.out.print(sum);
	}

}
