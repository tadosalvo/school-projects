/**
 * 
 * @author 	Thaddeus Osalvo
 * Date 	November 16, 2020
 * Purpose	To catch exceptions during input errors
 * 
 * 
 */
import javax.swing.JOptionPane;
public class ProfessorNumberError {

	public static void main(String[] args) {
		// Local variables
		String input;
		int number;
		
		// Get a number from the user
		// catch exception if user enters bad data (i.e. not an integer)
		
		try {
		
			input = JOptionPane.showInputDialog("Enter a number between 0-100");
			number = Integer.parseInt(input); // if fail, go catch
			System.out.println("You entered the number " + number);
			
		} catch (NumberFormatException e) {
			System.out.println("Conversion error: "  + e.getMessage());
		
		} finally {
			System.out.println("This is the end of the try/catch block.");
		}
		
		
		// Create an array and purposely go past the end of the array
		double deposits[] = {7.29, 84.1, 2756.93, 45.67, 123.00};
		
		try {
			for (int cntr = 0; cntr <= deposits.length; cntr++) {
				System.out.printf("Deposit #%d: $%,9.2f %n", cntr, deposits[cntr]);
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Out of bounds: " + ae.getMessage());
		}
		
		
		// Print stuff after trying to get the number
		System.out.println("This is the end of the program.");
		
		
	}

}
