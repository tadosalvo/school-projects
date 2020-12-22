/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 1, 2020
 * Purpose	To demo the LandTract class by asking the user to enter dimensions for the two tracts of land
 *
 */
import java.util.Scanner;
public class OsalvoLandTractDemo {

	public static void main(String[] args) {
		
		int length1, length2, width1, width2;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Asks user for first land tract input
		System.out.print("Enter length of first land tract:");
		length1 = keyboard.nextInt();
		System.out.print("Enter width of first land tract:");
		width1 = keyboard.nextInt();
		
		// Create new first land tract object
		OsalvoLandTract LandTract1 = new OsalvoLandTract(length1, width1);
		
		// Asks user for second land tract input
		System.out.print("Enter length of second land tract:");
		length2 = keyboard.nextInt();
		System.out.print("Enter width of second land tract:");
		width2 = keyboard.nextInt();
		
		// Create new second land tract object
		OsalvoLandTract LandTract2 = new OsalvoLandTract(length2, width2);
		
		keyboard.close();
		
		// Prints toString method from OsalvoLandTract class
		System.out.println(LandTract1.toString());
		System.out.println(LandTract2.toString());
		
		// Outputs whether or not tracts are the same size
		if (LandTract1.equals(LandTract2) == true) {
			System.out.println("The two tracts have the same size.");
		}
		
		else {
			System.out.println("The two tracts do not have the same size.");
		}
		
	}

}
