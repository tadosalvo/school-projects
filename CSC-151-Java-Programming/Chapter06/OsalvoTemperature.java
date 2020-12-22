/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		October 11, 2020
 * Purpose 	To input a fahrenheit temperature and convert the value to celsius and kelvin using methods
 *
 */
import java.util.Scanner;
public class OsalvoTemperature {
	
		// Fields
		private double ftemp;
		
		// Temperature Constructor
		public OsalvoTemperature(double fahrenheit) {
			ftemp = fahrenheit;
		}
		
		// Accepts Fahrenheit temperature and sets it to ftemp
		public void setFahrenheit(double fahrenheit) {
			ftemp = fahrenheit;
		}
		
		// Returns ftemp as a Fahrenheit temperature
		public double getFahrenheit() {
			return ftemp;
		}
		
		// Returns Celsius and converts using ftemp
		public double getCelsius() {
			return ((ftemp - 32) * 5/9);
		}
		
		// Returns Kelvin and converts using ftemp
		public double getKelvin() {
			return ((ftemp - 32) * 5/9) + 273;
		}
		
		// main method
		public static void main(String[] args) {
			
			// Creates new scanner object
			Scanner keyboard = new Scanner(System.in); 
			
			// User inputs fahrenheit temp
			System.out.print("Enter a Fahrenheit temperature:");
			double fahrenheit = keyboard.nextDouble();
			
			// Creates new temperature object
			OsalvoTemperature temp = new OsalvoTemperature(fahrenheit);
			
			// Displays Fahrenheit, Celsius, and Kelvin
			System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
			System.out.println("The temperature in Celsius is " + temp.getCelsius());
			System.out.println("The temperature in Kelvin is " + temp.getKelvin());
			
			keyboard.close();
		}
}
