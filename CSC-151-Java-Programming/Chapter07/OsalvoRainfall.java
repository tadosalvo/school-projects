/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		October 25, 2020
 * Purpose 	To create a rainfall class that stores 12 months into an array that have methods
 *			that return the total rainfall for the year, avg monthly rainfall, month with most rain,
 *			month with least rain.
 */
import java.util.Scanner;
public class OsalvoRainfall {

	// Fields
	private double[] rainValue;
	
	// Constructor that loops over array and initializes rainfall values
	public OsalvoRainfall(double[] input) {
		rainValue = new double[input.length];
		
		for(int index = 0; index < input.length; index++)
			rainValue[index] = input[index];
	}
	
	
	// Method that assigns month to array index and prints corresponding month
	public static void getMonth(int index) {
		
		String[] months = { "January", "February", "March",
				"April", "May", "June", "July",
                "August", "September", "October",
                "November", "December" };
		
		for (int counter = 0; counter < 12; counter++) {
			if (counter == index)
				System.out.print(months[counter]);
		}
		
	}
	
	// Method that gets array values
	public static void getValues(double [] valueInput) {
		
		String[] months = { "January", "February", "March",
				"April", "May", "June", "July",
                "August", "September", "October",
                "November", "December" };
		
		
		// Creates scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Loops and assigns values into array
		for (int index = 0; index < valueInput.length; index++) {
			System.out.print("What is the rainfall for " + months[index] + "? ");
			valueInput[index] = keyboard.nextDouble();
			
			// Input validation to not accept negative numbers
			if (valueInput[index] < 0) {
				System.out.println("Please enter a valid rainfall value.");
				index--;
			}
		}
		keyboard.close();
	}
	
	// Method that calculates total rainfall
	public double getTotalRainfall() {
		double total = 0;
		for (int index = 0; index < rainValue.length; index++) {
			total += rainValue[index];
		}
		return total;
	}
	
	// Method that calculates average monthly rainfall
	public double getAverage() {
		double average = getTotalRainfall()/rainValue.length;
		return average;
	}
	
	
	/** Written by Professor T on 2019-03-11
	 * Find and return the lowest value in an array of numbers (date type double)
	 * @param rain is the array of numbers
	 * @return the lowest number in the array
	 */
	public static double findLowestValue (double rain[]) {
		double lowest = rain[0];
		for (int counter = 1; counter < rain.length; counter++) {
			if (rain[counter] < lowest)
				lowest = rain[counter];
		}
		return lowest;
	}
	
	// Finds highest rainfall value in an array
	public static double findHighestValue (double[] rain) {
		double highest = rain[0];
		for (int counter = 1; counter < rain.length; counter++) {
			if (rain[counter] > highest)
				highest = rain[counter];	
		}
		return highest;
	}
	
	
	
	/** Written by Professor T on 2019-03-11
	 * Find and return the position of the lowest value in an array of numbers
	 * @param rain is the array of numbers
	 * @return the array position of the lowest number in the array
	 */
	public static int findLowestIndex (double rain[]) {
		int lowIndex = 0; 
		for (int counter = 1; counter < rain.length; counter++) {
			if (rain[counter] < rain[lowIndex]) {
				lowIndex = counter;
			}
		}
		return lowIndex;
	}
	
	// Finds the position of the highest value in an array
	public static int findHighestIndex (double[] rain) {
		int highIndex = 0;
		for (int counter = 1; counter < rain.length; counter++) {
			if (rain[counter] > rain[highIndex]) {
				highIndex = counter;
			}
		}
		return highIndex;
	}
	
	
	
	public static void main(String[] args) {
		
		final int MONTHS = 12;
		
		// Creates rainfall value array object
		double [] rainValue = new double[MONTHS];
		
		// Gets array values
		getValues(rainValue);
		
		// Creates new rainfall object and assigns input values
		OsalvoRainfall rainfallData = new OsalvoRainfall(rainValue);
		
		// Displays total rainfall
		System.out.printf("The total rainfall for the year: %.2f\n", rainfallData.getTotalRainfall());
		
		// Displays average rainfall
		System.out.printf("The average rainfall for the year: %.2f\n", rainfallData.getAverage());
		
		
		//Displays the name of the month with the least rain with its value
		System.out.print("The month with the least rainfall for the year is ");
		int leastRain = findLowestIndex(rainValue);
		getMonth(leastRain);
		System.out.println(" and the amount of rain it produced is " + findLowestValue(rainValue));
		
	
		//Displays the name of the month with the most rain with its value
		System.out.print("The month with the most rainfall for the year is ");
		int mostRain = findHighestIndex(rainValue);
		getMonth(mostRain);
		System.out.println(" and the amount of rain it produced is " + findHighestValue(rainValue));
	}
}
