/**
 * 
 * @author Thaddeus Osalvo
 * Date		October 5, 2020
 * Purpose	To demonstrate a gradebook using Student objects
 *
 */
import java.util.Scanner;
public class OsalvoGradebook {

	public static void main(String[] args) {
		// Local variables
		Scanner keyboard = new Scanner(System.in);
		OsalvoStudent myStudent = new OsalvoStudent();
		OsalvoStudent otherStudent = new OsalvoStudent();
		OsalvoStudent thaddeus = new OsalvoStudent("Osalvo", 123456);
		String studentName;
		int myIDnumber, grade1, grade2, grade3;
		
		
		// Set the student's name
		myStudent.setName("Osalvo");
		myStudent.setStudentID(3341);

		// Get the student's name and ID number
		studentName = myStudent.getName();
		myIDnumber = myStudent.getStudentID();
		
		// Get three grades to calculate average
		System.out.print("What is your first grade? ");
		grade1 = keyboard.nextInt();
		
		System.out.print("What is your second grade? ");
		grade2 = keyboard.nextInt();
		
		System.out.print("What is your third grade? ");
		grade3 = keyboard.nextInt();
		
		myStudent.calcAverage(grade1, grade2, grade3);
		
		
		
		
		// Print the first student information
		//System.out.println("Hello " + studentName);
		//System.out.printf("Your student ID number is %6d \n", myIDnumber);
		//System.out.printf("Your average is %.2f \n", myStudent.getAverage());
		myStudent.displayInfo();
		
		
		// Print the student information
		// System.out.println("Hello " + otherStudent.getName());
		// System.out.printf("Your student ID number is %6d \n", otherStudent.getStudentID());
		// System.out.printf("Your average is %.2f \n", otherStudent.getAverage());
				
		
		
	}

}
