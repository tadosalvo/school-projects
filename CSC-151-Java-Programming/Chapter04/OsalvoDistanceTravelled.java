/**
 * 
 * @author	Thaddeus Osalvo
 *	Date 	September 27, 2020
 *	Purpose To calculate total distance traveled with user input on speed and time.
 *
 */
import java.util.Scanner;
public class OsalvoDistanceTravelled {
	
	public static void main(String[] args) {
		
		// Local variables
		int speed = -1, hours = 0, distance = 0, cntr;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Checks if speed is not negative
		while (speed < 0) {
			
		// Asks user vehicle speed
		System.out.print("Enter vehicle speed (in mph): ");
		speed = keyboard.nextInt();	
		}
		
		// Checks if time is greater than equal to 1
		while (hours <= 0) {
			
		// Asks user time traveled in hours
		System.out.print("Enter time travelled (in hrs): ");
		hours = keyboard.nextInt();
		}
		
		keyboard.close();
		
		System.out.println("Hour	Distance Travelled");
		System.out.println("--------------------------");
		
		

		// for loop is used since we know how many iterations to produce
		for (cntr = 1; cntr <= hours; cntr++) {
			
			
			// Prints hours in every iteration
			System.out.print(cntr + "		");
			
			// Calculation of distance traveled
			distance = cntr * speed;
			
			
			// Prints total distance traveled every iteration
			System.out.print(distance + "\n");
			 
			}
		}
}