
import java.util.Scanner;
public class OsalvoDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String movie1 = "Moana";
		String movie2 = "Groundhog Day";
		String movie3 = "Star Wars";
		
		int length1 = 92;
		int length2 = 120;
		int length3 = 185;
		int choice;
		int hours, minutes;

		do {
			System.out.println("Welcome to Quarantine Theater!");
			System.out.println(" 1: " + movie1);
			System.out.println(" 2: " + movie2);
			System.out.println(" 3: " + movie3);
			System.out.println(" 4: Leave Theater");
			System.out.println("Choose your movie: ");
			choice = keyboard.nextInt();
			
			while(choice > 4 || choice < 1) {
				System.out.println("Invalid movie. Please choose another: ");
				choice = keyboard.nextInt();
				
			}
			
			switch(choice) {
				case 1:
					System.out.println("You have chosen to watch " + movie1);
					hours = length1 / 60;
					minutes = length1 % 60;
					System.out.println("The length of this movie is " + hours + " hours and " + minutes + " minutes");
					break;
				
				case 2:
					System.out.println("You have chosen to watch " + movie2);
					hours = length1 / 60;
					minutes = length2 % 60;
					System.out.println("The length of this movie is " + hours + " hours and " + minutes + " minutes");
					break;
					
				case 3:
					System.out.println("You have chosen to watch " + movie3);
					hours = length1 / 60;
					minutes = length3 % 60;
					System.out.println("The length of this movie is " + hours + " hours and " + minutes + " minutes");
					break;
					
				case 4:
					System.out.println("Thanks for visiting. Goodbye!");
					break;
				default:
					System.out.println("Invalid movie");
					
			}
		} while (choice != 4);
		//close keyboard
		keyboard.close();
	}

}
