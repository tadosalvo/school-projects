/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 1, 2020
 * Purpose 	To write a class that returns methods such as area, equals, toString
 */
public class OsalvoLandTract {
	
	// Fields
	private int length;
	private int width;
	
	// Constructor
	public OsalvoLandTract() {
		this.length = length;
		this.width = width;
	}
	
	public OsalvoLandTract(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	// Area method that calculates tract's area
	public int area() {
		return this.length * this.width;
		
	}
	
	// Equals method that compares two tracts if they have the same dimensions
	public boolean equals(OsalvoLandTract object) {
		
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

}