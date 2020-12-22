import javax.swing.JOptionPane;
public class OsalvoCoins {

	public static void main(String[] args) {
		// Local variables
		int value;
		String input;
		
		// Ask student for coin denomination
		input = JOptionPane.showInputDialog("What is the value of your coin?");
		value = Integer.parseInt(input);
		
		// Display value
		System.out.println("Value = " + value);
		
		
		// Determine the coin
		switch(value) {
		case 1:
			System.out.println("You have a penny.");
			break;
		case 5:
			System.out.println("You have a nickel.");
			break;
		case 10:
			System.out.println("You have a dime.");
			break;
		case 25:
			System.out.println("You have a quarter.");
			break;
		case 50:
			System.out.println("You have a half-dollar.");
			break;
		default:
			System.out.println("I do not know what coin you have.");
		}
		
	}

}
