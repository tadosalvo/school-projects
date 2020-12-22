import java.util.Scanner;
import java.io.*; // Input everything from the library

public class OsalvoReadFromInputFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		int grade1, grade2, grade3;
		double average;
		
		// Create Scanner to read from given file name
		String filename = "students.txt";
		File myFile = new File(filename);
		Scanner input = new Scanner(myFile);
		
		// Get student's name from file
		System.out.print("Please enter your name: ");
		name = input.nextLine();
		
		
		// Get three grades from the file
		System.out.print("Enter grade #1: ");
		grade1 = input.nextInt();
		
		System.out.print("Enter grade #2: "+ grade1);
		grade1 = input.nextInt();
		
		System.out.print("Enter grade #3: " + grade1);
		grade1 = input.nextInt();
		
		
		
		
	}

}
