import java.util.Scanner;
import java.io.*;

public class OsalvoWriteToOutputFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String outputFile = "studentOut.txt";
		PrintWriter output = new PrintWriter(outputFile);
		//output.println("Hello" + name);
		//output.println("The first grade is " + grade1);
		
		output.close();
		
		
	}

}
