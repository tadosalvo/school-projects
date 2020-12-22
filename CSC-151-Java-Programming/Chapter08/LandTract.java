import java.util.Scanner;
public class LandTract {
	
	// Fields
	private int length;
	private int width;
	
	// Constructor
	public LandTract() {
		this.length = length;
		this.width = width;
	}
	
	public LandTract(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	// Area method that calculates tract's area
	public int area() {
		return length * width;
		
	}
	
	// Equals method that compares two tracts if they have the same dimensions
	public boolean equals(LandTract object) {
		
		boolean status;
		/** 
		 * First compares the first object's lengths with the second objects length
		 * AND operator is used to compare widths of the first and second object
		 * 
		 * Second portion is an OR statement to check if the first object length matches
		 * the second objects width, vise versa
		 * 
		**/
		
		if (length == (object.length) && width == (object.width) 
				|| length == (object.width) && width == (object.length)) {
			status = true;
		}
		else {
			status = false;
		}
		return status;
	}
	
	// toString that outputs LandTract width and length
	public String toString() {
		String str = ("LandTract with length " + length +", width " + width +", and area " + area());
		return str;
	}

	public static void main(String[] args) {
		
		int length1, length2, width1, width2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter length of first land tract:");
		length1 = keyboard.nextInt();
		System.out.print("Enter width of first land tract:");
		width1 = keyboard.nextInt();
		
		LandTract LandTract1 = new LandTract(length1, width1);
		
		System.out.print("Enter length of second land tract:");
		length2 = keyboard.nextInt();
		System.out.print("Enter width of second land tract:");
		width2 = keyboard.nextInt();
		
		LandTract LandTract2 = new LandTract(length2, width2);
		
		keyboard.close();
		
		System.out.println(LandTract1.toString());
		System.out.println(LandTract2.toString());
		
		if (LandTract1.equals(LandTract2) == true) {
			System.out.println("The two tracts have the same size.");
		}
		
		else {
			System.out.println("The two tracts do not have the same size.");
		}
		
	}

}