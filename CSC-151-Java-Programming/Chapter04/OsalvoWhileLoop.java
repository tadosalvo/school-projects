import java.util.Scanner;

/**
 * 
 * @author	Thaddeus Osalvo
 *	Date 	September 21, 2020
 *	Purpose To display a list of numbers using a while loop
 */
public class OsalvoWhileLoop {

	public static void main(String[] args) {
		// local variables
		Scanner keyboard = new Scanner(System.in);
		int number;
		int counter = 1;
		
		// Ask the student for a number
		System.out.print("Enter a number between 1-10: ");
		number = keyboard.nextInt();
		
		// Check if counter less than or equal to number
		if(counter < number) {
			System.out.println("Counter is less than number");
		}
		
		while(counter < number) {
			System.out.println("Counter: " + counter + " equals ");
			// System.out.println("Counter: " + counter);
			// counter = counter
			
			counter++;
			
		}
		keyboard.close();
	}

}
