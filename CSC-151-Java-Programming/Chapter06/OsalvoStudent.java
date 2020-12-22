/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		October, 5, 2020
 * Purpose	To create a Student object class for another demo class
 *
 */
public class OsalvoStudent {
	
	// Object attributes/fields
	private String name;
	private int studentID;
	private double average;
	private char letter;
	
	// Constructors
	// Default constructor || no arg constructor
	public OsalvoStudent () {
		name = "New Student";
		studentID = 0;
		average = 0.0;
		letter = 'U';
	}
	
	
	// Constructor when you know name and ID number
	public OsalvoStudent(String n, int id) {
		name = n;
		studentID = id;
		average = 0.0;
		letter = 'U';
		
	}
	
	// Setter methods (mutators)
	// changes information in a class
	public void setName (String n) {
		name = n;
	}
	
	public void setStudentID (int id) {
		studentID = id;
	}
	
	// Getter methods (accessors)
	public int getStudentID() {
		return studentID;
	}
	
	public String getName() {
		return name;			
	}
	
	public double getAverage() {
		return average;
	}
	
	public void calcAverage(int a, int b, int c) {
		int total = a + b + c;
		average = (double)total / 3.0;
		determineLetter();
		
		
		// return (a + b + c)/3.0;
		
	}
	
	private void determineLetter() {
		if (average >= 90.0)
			letter = 'A';
		else if (average >= 80){
			letter = 'B';
		}
		else if (average >= 70){
			letter = 'C';
		}
		else if (average >= 60){
			letter = 'D';
		}
		else {
			letter = 'F';
		}
	}
	
	public void displayInfo() {
		System.out.println("Hello " + name);
		System.out.printf("Your student ID number is %6d \n", studentID);
		System.out.println("Your class average is " + (int)average);
		System.out.println("Your letter grade is " + letter);
		
	}
	
	
}
