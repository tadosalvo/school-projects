/**
 * 
 * @author	Thaddeus Osalvo
 *	Date 	September, 20 2020
 *	Purpose To input the number of packages and to calculate the total cost after the discount
 */
import java.util.Scanner;
public class OsalvoSoftwareSales {

	public static void main(String[] args) {
		
		// Local variables
		Scanner keyboard = new Scanner (System.in);
		int packageNum;
		double discountPercent, totalDiscount, totalCost, finalPrice;
		
		System.out.print("Enter number of packages purchased: ");
		packageNum = keyboard.nextInt();
		
		// Determines percentage discount
		if (packageNum >= 10 && packageNum <= 19) {
			discountPercent = 20;
		}
		else if (packageNum >= 20 && packageNum <= 49) {
			discountPercent = 30;
		}
		else if (packageNum >= 50 && packageNum <=99) {
			discountPercent = 40;
		}
		else if (packageNum >= 100) {
			discountPercent = 50;
		}
		else {
			discountPercent = 0;
		}
		
		// Calculates total cost, discount cost, and final price
		totalCost = (packageNum * 99);
		totalDiscount = ((discountPercent / 100) * totalCost);
		finalPrice = (totalCost - totalDiscount);

		// Displays discount and total output
		System.out.printf("Your discount is: $%.2f\n", totalDiscount);
		System.out.printf("Your total is: $%.2f", finalPrice);
		keyboard.close();
	}

}
