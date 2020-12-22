/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 1, 2020
 * Purpose 	To write a class that has three overloaded static methods for circles, rectangles
 * 			cylinders
 */
import java.util.Scanner;
public class OsalvoArea {
	
	// Method that calculates circle area with a double parameter
	public static double getArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	// Method that calculates rectangle area with a two double parameters
	public static double getArea(double width, double length) {
		return width * length;
		
	}
	
	// Method that calculates cylinder area with a double and a float parameter.
	public static double getArea(double radius, float height) {
		return Math.PI * radius * radius * height;
		
	}
	
	
	public static void main(String[] args) {
		
		// Main method variables
		double radius, baseRadius;
		float height;
		double width, length;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("=== Area Calculator ===\n");
		
		// Asks user for inputs
		System.out.print("Enter radius to calculate circle area: ");
		radius = keyboard.nextDouble();
		System.out.print("Enter width to calculate rectangle area: ");
		width = keyboard.nextDouble();
		System.out.print("Enter length to calculate rectangle area: ");
		length = keyboard.nextDouble();
		System.out.print("Enter base radius to calculate cylinder area: ");
		baseRadius = keyboard.nextDouble();
		System.out.print("Enter height to calculate cylinder area: ");
		height = keyboard.nextFloat();
		
		System.out.print("\n");
		
		
		System.out.println("--------");
		System.out.println("Results:");
		System.out.println("--------");
		
		System.out.print("\n");
		
		// Calling overloaded getArea methods
		System.out.printf("The area of the circle is: %.2f\n", getArea(radius));

		System.out.printf("The area of the rectangle is: %.2f\n", getArea(width, length));
		
		System.out.printf("The area of the cylinder is: %.2f\n", getArea(baseRadius, height));

		keyboard.close();
	}

}
