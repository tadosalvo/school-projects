/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		October 26, 2020
 * Purpose	To create a new gradebook with an embedded student class
 *
 */
import java.util.Scanner;

class OsalvoStudent {
	private String name;
	private double average;
	private char letter;
	
	/**
	 * Default constuctor, garbage info
	 */
	public OsalvoStudent() {
		this.name = "Nobody";
		this.average = -1.0;
		this.letter = 'Z';
		
	}
	/**
	 * Constuctor with name but no grades
	 * @param name
	 */
	public OsalvoStudent(String name) {
		this.name = name;
		this.average = -2.0;
		this.letter = 'X';
	}
	
	// Getter methods (Accessor methods)
	public String getName() {
		return this.name;
		
	}
	
	public double getAverage() {
		return this.average;
	}
	public char getLetter() {
		return this.letter;
	}
	
	// Setter method (Mutators)
	/**
	 * Set the name of the this object
	 * @param name is the argument being saved to the object
	 */
	public void setName(String name) {
		this.name = name; // sets the field equal to the argument
		// name = this.name; sets the argument equal to the field
	}
	/**
	 * Calculate the average using three integer grades
	 * @param g1 is the first int argument
	 * @param g2 is the second int argument
	 * @param g3 is the third int argument
	 */
	public void calcAverage(int g1, int g2, int g3) {
		this.average = (g1 + g2 +g3)/3.0;
		determineLetter();
	}
	
	
	
	public void calcAverage (int[] grades) {
		int total = 0;
		int len = grades.length;
		for(int ct = 0; ct < len; ct++) {
			total += grades[ct];
		}
		this.average = (double)total/len;	
		determineLetter();
	}
	
	public void calcAverage (double[] grades) {
		double total = 0.0;
		int len = grades.length;
		for (int ct = 0; ct < len; ct++) {
			total += grades[ct];
		}
		this.average = total/grades.length;
		determineLetter();
	}
	
	
	private void determineLetter() {
		if (this.average >= 90.0)
			letter = 'A';
		else if (this.average >= 80)
			letter = 'B';
		else if (this.average >= 70)
			letter = 'C';
		else if (this.average >= 60)
			letter = 'D';
		else
			letter = 'F';
	}
	
	public String toString() {
		String myAverage = String.format("%.2f", this.average);
		String output = "";
		output += "This student's name is " + this.name + "\n";
		output += "Their average is " + myAverage + "\n";
		output += "Their final letter grade is " + this.letter + "\n";
		return output;
	}
	
}


public class OsalvoGradebookDemo {
	
	// Ask for student's name and create Student object
	// Scope allows keyboard to be access in different class due to "static"
	static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args) {
		// Local variables
		OsalvoStudent myStudent = createNewStudent();
		int myGrades[] = getGrades();
		myStudent.calcAverage(myGrades);
		System.out.println(myStudent);
		//System.out.println(myStudent.toString());
		
		OsalvoStudent anotherOne = new OsalvoStudent("Omar");
		double yourGrades[] ={94.0, 93.2, 85.45, 31.415926, 100.0};
		anotherOne.calcAverage(yourGrades);
		System.out.println(anotherOne);
	}
	
	public static OsalvoStudent createNewStudent() {
		System.out.print("What is the student's name? ");
		String studentName = keyboard.nextLine();
		OsalvoStudent you = new OsalvoStudent(studentName);
		return you;
		
	}
	
	public static int[] getGrades() {
		System.out.print("How many grades are you going to enter? [1-10] ");
		int numGrades = keyboard.nextInt();
		
		while (numGrades < 1 || numGrades > 10) {
			System.out.print("Please enter a number 1-10: ");
			numGrades = keyboard.nextInt();
		}
		int[] grades = new int[numGrades];
		for (int cntr = 0; cntr < numGrades; cntr++) {
			System.out.print("Enter grade " + cntr + ": ");
			//grades[cntr] = keyboard.nextInt();
			int grade = keyboard.nextInt();
			while (grade < 0 || grade > 100) {
				System.out.print("Please enter a grade 0-100");
				grade = keyboard.nextInt();
			}
			grades[cntr] = grade;
		}
		return grades;
	}

}
