/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 2, 2020
 * Purpose	To determine the types of characters in a given string
 *
 */
import javax.swing.JOptionPane;
public class ProfessorTextEvaluator {

	public static void main(String[] args) {
		
		// Local variables
		String inputString; //1
		String [] charTypes = {"Total", "Uppercase", "Lowercase", "Numbers", "Spaces", "Symbols"}; //2
		int [] charCounts = new int [charTypes.length];//3
		
		
		// Ask the user for text to evaluate
		inputString = JOptionPane.showInputDialog("Please enter text to evaluate");
		
		
		// Display the text and the length of the text to the console
		charCounts[0] = displayTextAndLength(inputString);
		
		// Display the type of each character in the string
		charCounts = charType(inputString, charCounts);
		
		// Display the count of each character in the string
		displayResults(charTypes, charCounts);

	}
	
	public static int displayTextAndLength(String str) {
		System.out.println(str);
		System.out.println("Your text is " + str.length() + " characters long.");
		return str.length();
	}
	
	
	// Durham Tech 2020
	public static int[] charType(String str, int[] counts) {
		char ch;
		for (int cntr = 0; cntr  < str.length(); cntr++) {
			ch = str.charAt(cntr); // grabs the character at the cntr position
			if (Character.isLetter(ch)) {
				// System.out.println(ch + " is a letter");
				if (Character.isUpperCase(ch)) {
					System.out.println(ch + " is a uppercase letter");
					counts[1]++;
					
				} else {
					System.out.println(ch + " is a lowercase letter");
					counts[2]++;
				}
			} else if (Character.isDigit(ch)) {
				System.out.println(ch + " is a number");
				counts[3]++;
			} else if (Character.isWhitespace(ch)) {
				System.out.println(ch + " is a space");
				counts[4]++;
			} else {
				System.out.println(ch + " is a symbol");
				counts[5]++;
			}
			
		}
		return counts;
	}
	
	public static void displayResults (String [] labels, int [] counts) {
		for (int cntr = 0; cntr < labels.length; cntr++) {
			System.out.println(labels[cntr] + ": " + counts[cntr]);
		}
		
	}
}
