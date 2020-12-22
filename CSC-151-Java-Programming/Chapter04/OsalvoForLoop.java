
import java.util.Scanner;

import javax.swing.JOptionPane;
public class OsalvoForLoop {

	public static void main(String[] args) {
		// Local variables
		double grade1, grade2, grade3;
		String input, name;
		double grade, total = 0, average;
		char letter;
		
		// Ask student for their name
		name = JOptionPane.showInputDialog("Please enter your name.");
		
		// Ask student for three grades
		for (int cntr = 1; cntr <= 3; cntr++) {
			input = JOptionPane.showInputDialog("Enter Grade #" + cntr);
			grade = Double.parseDouble(input);
			
			while (grade < 0 || grade > 100) {
				input = JOptionPane.showInputDialog("Error. Please enter a grade 0-100 \n Enter Grade #" + cntr);
				grade = Double.parseDouble(input);
			}
			total = total + grade;
			System.out.println("Total = " + total);
		}
		
		// Calculate average
		
		average = total / 3.0;
		
		
		// Determine letter grade
		if (average >= 90.0) {
			letter = 'A';
		} else if (average >= 80.0) {
			letter = 'B';
		
		} else if (average >= 70.0) {
			letter = 'C';
		
		} else if (average >= 60.0) {
			letter = 'D';
		} else {
			letter = 'F';
		}
		
		// Display name, average, letter grade
		System.out.println("Hello " + name + "!!");
		// System.out.println("Your average is " + average);
		System.out.printf("Your average is %.1f \n", average);
		System.out.println("Your letter grade is " + letter);

	}

}
