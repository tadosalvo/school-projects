/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		September 14,2020
 * Purpose	To determine if a student earns a scholarship
 * 			3.0 GPA | 1200 SAT score
 * 
 */
import java.util.Scanner;
public class OsalvoScholarship {

	public static void main(String[] args) {
		// Local variables
		
		// Ask the student to enter their HS GPA
		double studentGPA;
		int scoreSAT;
		double amount;
		Scanner keyboard = new Scanner (System.in);
		
		// Ask the student to enter their HS GPA
		System.out.print("What is your high school GPA? ");
		studentGPA = keyboard.nextDouble();
		
		// Ask the student to enter SAT score
		System.out.print("What is your SAT score? ");
		scoreSAT = keyboard.nextInt();
		
		// If HS GPA or SAT qualify, then award scholarship
		// If not, then politely decline
		if (studentGPA >= 3.0 || scoreSAT >= 1200) {
			System.out.println("Congratulations!");
			amount = 2500.0;
			System.out.println("Call your mama and tell her the good news!);");
		}
			else {
			System.out.println("Sorry you do not qualify.");
			amount = 0.0;
		}
		// Displays GPA and SAT score and scholarship amount
		System.out.println("Your high school GPA is " + studentGPA);
		System.out.println("Your SAT score is " + scoreSAT);
		System.out.println("Scholarship amount: " + amount);
		
		
		// If HS GPA and SAT do not qualify, then politely decline
		keyboard.close();
		
	}

}
