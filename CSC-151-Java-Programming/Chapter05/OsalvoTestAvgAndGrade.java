/**
 * 
 * @author	Thaddeus Osalvo
 *	Date 	October 4, 2020
 *	Purpose To write a program that averages 5 test scores and displays a letter grade while using methods
 *
 */
import java.util.Scanner;
public class OsalvoTestAvgAndGrade {

	public static void main(String[] args) {
		// Local Variables
		Scanner keyboard = new Scanner(System.in);
		double studentGrade1, studentGrade2, studentGrade3, studentGrade4, studentGrade5;
		
		// User inputs test grades
		System.out.print("Enter test grade for student 1: ");
		studentGrade1 = keyboard.nextDouble();
		
		System.out.print("Enter test grade for student 2: ");
		studentGrade2 = keyboard.nextDouble();
		
		System.out.print("Enter test grade for student 3: ");
		studentGrade3 = keyboard.nextDouble();
		
		System.out.print("Enter test grade for student 4: ");
		studentGrade4 = keyboard.nextDouble();
		
		System.out.print("Enter test grade for student 5: ");
		studentGrade5 = keyboard.nextDouble();
		
		System.out.println("The letter grades are as follows:");
		
		
		// Outputs students letter grade
		System.out.println("Student 1: " + determineGrade(studentGrade1));
		
		System.out.println("Student 2: " + determineGrade(studentGrade2));
		
		System.out.println("Student 3: " + determineGrade(studentGrade3));
		
		System.out.println("Student 4: " + determineGrade(studentGrade4));
		
		System.out.println("Student 5: " + determineGrade(studentGrade5));
		
		// Outputs average grade
		System.out.printf("The average grade was: %.2f", calcAverage(studentGrade1, studentGrade2, studentGrade3, studentGrade4, studentGrade5));
		
		// Closes keyboard
		keyboard.close();
	}
	
	public static double calcAverage(double studentGrade1, double studentGrade2, double studentGrade3, double studentGrade4, double studentGrade5) {
		
		// Method calculates averages with grade inputs
		double total = studentGrade1 + studentGrade2 + studentGrade3 + studentGrade4 + studentGrade5;
		double avg = total / 5.0;
		return avg;
	}
	
	 public static char determineGrade(double grade) {
		
		char letter;
		// Method uses an if statement to determine letter grade
		if (grade >= 90) {
			letter = 'A';
		} else if (grade >= 80) {
			letter = 'B';
		} else if (grade >= 70) {
			letter = 'C';
		} else if (grade >= 60) {
			letter = 'D';
		} else {
			letter = 'F';
		}
		return letter;
	}
	

}
