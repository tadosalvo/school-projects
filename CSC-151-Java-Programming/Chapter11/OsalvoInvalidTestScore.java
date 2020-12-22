/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 18, 2020
 * Purpose	To create a InvalidTestScore class that throws an exception 
 * 			if any of the numbers are invalid. Outputs "Invalid test score."
 * 
 *
 */
import java.util.Scanner;
public class OsalvoInvalidTestScore extends Exception {
	
	// Constructor
	public OsalvoInvalidTestScore() {
		super("Invalid test score.");
	}
	
	public OsalvoInvalidTestScore(double n) {
		super("Invalid test score.");
	}

	
}

class Driver {
	static Scanner keyboard = new Scanner(System.in);
	
	// Fields
	private double[] scores;
	String str;
	
	// Constructor that inputs test scores
	public Driver(double[] s) throws OsalvoInvalidTestScore {
		scores = new double[s.length]; // create a new array for the object
		for (int cntr = 0; cntr < s.length; cntr ++) {
			scores[cntr] = s[cntr];
			if (scores[cntr] < 0 || scores[cntr] > 100) {
				throw new OsalvoInvalidTestScore();
			}
		}
	}
	
	// Method that calculates the average
	public double getAverage() {
	double total = 0.0;
	for (int cntr = 0; cntr < scores.length; cntr ++) {
		total += scores[cntr];
		
	}
	return total/ scores.length;
	}
	
	// Main method
	public static void main(String[] args) throws OsalvoInvalidTestScore {
		
		// Local variables
		int cntr, i;
		
		// Inputs number of test scores
		System.out.print("Enter number of test scores:");
		cntr = keyboard.nextInt();
		
		double[] array = new double[cntr];

		try { // inputs the test scores in the array
			for (i = 0; i < cntr; i++) {
				System.out.print("Enter test score " + (i+1) + ":");
				array[i] += keyboard.nextDouble();
			}	
			Driver scores = new Driver(array);
			double average = scores.getAverage(); // calls the get average method
			
			System.out.print(average);
		} catch (OsalvoInvalidTestScore e) { // catch outputs the exception message
			System.out.println(e.getMessage());
			
		}
	}
	
}