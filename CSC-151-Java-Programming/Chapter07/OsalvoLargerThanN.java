/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		October 25, 2020
 * Purpose 	To create a method that accepts two arguments that prints all numbers of the array greater than n
 *
 */
public class OsalvoLargerThanN {

	public static void main(String[] args) {
		
		// initializes array and n and calls largerN method
		int[] array1 = {1, 5, 10, 2, 4, -3, 6};
		int num1 = 3;
		largerN(array1, num1);
		
		int[] array2 = {10, 12, 15, 24};
		int num2 = 12;
		largerN(array2, num2);

	}
	
	// method that uses a for loop and conditional statement to output values greater than n
	public static void largerN(int[] array, int n) {
		for(int index = 0; index < array.length; index++) {
			if (array[index] > n) {
				System.out.println(array[index]);
			}
		}
		
	}

}
