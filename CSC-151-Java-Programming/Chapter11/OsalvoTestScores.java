/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 18, 2020
 * Purpose	To accept an array of test scores and return the average of the test scores
 * 			Class should throw an illegalArgumentException if array is less than or greater than 100
 *
 */
import java.util.Scanner;
public class OsalvoTestScores {
	
	static Scanner keyboard = new Scanner(System.in);
	
	// Fields
	private double[] scores;
	
	// Constructor that inputs test scores
	public OsalvoTestScores(double[] s) throws IllegalArgumentException { // throws IllegalArgument Exception
		scores = new double[s.length]; // create a new array for the object
		for (int cntr = 0; cntr < s.length; cntr ++) {
			scores[cntr] = s[cntr];
			if (scores[cntr] < 0 || scores[cntr] > 100) {
				throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");
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
	public static void main(String[] args) {
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
			OsalvoTestScores scores = new OsalvoTestScores(array);
			double average = scores.getAverage(); // calls the get average method
			
			System.out.print(average);
		} catch (IllegalArgumentException e) { // catch outputs the exception message
			System.out.println(e.getMessage());
			
		}
	}
	
}
