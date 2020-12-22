import javax.swing.JOptionPane;
public class OsalvoProfessorGradebookMethods {

	public static void main(String[] args) {
		String myName;
		int grade1, grade2, grade3;
		double average;
		char myLetter;

		do {
		// Ask the student for their name
		myName = getName();
		
		
		// Ask the student for three grades
		grade1 = getGrade(myName);
		grade2 = getGrade(myName);
		grade3 = getGrade(myName);
		
		
		// Calculate average
		average = calculateAverage(grade1, grade2, grade3);
		
		
		
		// Determine letter grade
		myLetter = determineLetter(average);
		
		
		// Display name, average, and letter grade
		displayResults(myName, average, myLetter);
		} while (askAgain());
	}
	
	public static String getName() {
		String name;
		name = JOptionPane.showInputDialog("Please enter your name");
		return name;
		
	}
	public static int getGrade(String name) {
		String input;
		int grade;
		input = JOptionPane.showInputDialog("Hello " + name + ". Please enter your grade");
		grade = Integer.parseInt(input);
		
		// Data validation makes sure its within 0 - 100
		while (grade < 0|| grade > 100) {
			input = JOptionPane.showInputDialog("Error! Please enter your grade 0-100");
			grade = Integer.parseInt(input);
		}
		return grade;
		
		
	}
	
	public static double calculateAverage(int g1, int g2, int g3) {
		int total = g1 + g2 + g3;
		double avg = total / 3.0;
		return avg;
		// return (g1 + g2 + g3) / 3.0;
		
	}
	
	public static char determineLetter(double avg) {
		if (avg >= 90.0) {
			return 'A';
		} else if (avg >= 80.0) {
			return 'B';
		} else if (avg >= 70.0) {
			return 'C';
			
		} else if (avg >= 60.0) {
			return 'D';
		} else {
			return 'F';
		}
		
	}
	public static void displayResults(String name, double avg, char letter) {
		System.out.println("Welcome " + name);
		System.out.printf("Your average is %.2f \n", avg);
		System.out.println("Your letter grade is " + letter);
		System.out.println("Thank you for taking my class!");
		
	}
	
	public static boolean askAgain() {
		String input = JOptionPane.showInputDialog("Do you have another student? \n 1-Yes 2-No");
		int number = Integer.parseInt(input);
		if (number == 1)
			return true;
		else
			return false;
	}
}
