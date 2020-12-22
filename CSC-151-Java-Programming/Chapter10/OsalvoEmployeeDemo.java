/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 11, 2020
 * Purpose	Demo program will create
 * 			1 production worker objects
 * 			1 shift supervisor object
 *			Will ask user to enter 1 production worker
 *			Displays proper output
 */			
import java.util.Scanner;
public class OsalvoEmployeeDemo {

	static Scanner keyboard = new Scanner(System.in);

	// Main method that calls objects and methods
	public static void main(String[] args) {
		// Creating 1 production worker and 1 shift supervisor objects
		OsalvoProductionWorker kevin = new OsalvoProductionWorker("Kevin Smith", "123-A", "12/15/2000", 1, 50.0);
		
		// Calls newProdWorker method and outputs Shift Supervisor and User input Production Worker info
		newProdWorker();
		
		// Outputs Production Worker Kevin info
		System.out.println(kevin);
	}
	
	
	
	// Separate method that asks user to add an additional production worker
	public static void newProdWorker() {
		// Local Variables
		String name, number, date;
		int shift;
		double hourlyPayRate;
		
		OsalvoProductionWorker kevin = new OsalvoProductionWorker("Kevin Smith", "123-A", "12/15/2000", 1, 50.0);
		OsalvoShiftSupervisor thad = new OsalvoShiftSupervisor("Thaddeus Osalvo", "555-A", "1/1/2000", 100000.0);
		
		// Asks user for additional production worker
		System.out.print("Please enter production workers name: ");
		name = keyboard.nextLine();
		System.out.print("Please enter production workers number: ");
		number = keyboard.nextLine();
		System.out.print("Please enter production workers hire date: ");
		date = keyboard.nextLine();
		System.out.print("Please enter production workers shift (1 for day 2 for night): ");
		shift = keyboard.nextInt();
		System.out.print("Please enter production workers hourly payrate: ");
		hourlyPayRate = keyboard.nextDouble();
		System.out.print("\n");
		
		
		// Creates user generated production worker
		OsalvoProductionWorker userWorker = new OsalvoProductionWorker(name, number, date, shift, hourlyPayRate);
		
		// Outputs production worker info
		System.out.println(userWorker.toString());
		
		// Initializes shift values to production worker 1 and 2
		int p1 = shift;
		int p2 = kevin.getShift();
		
		// Calls the calc bonus method using the thad object to check if it's eligible for a bonus
		thad.calcBonus(p1, p2);
		
		// Outputs Thad Shift Supervisor info
		System.out.println(thad);
	}

}
