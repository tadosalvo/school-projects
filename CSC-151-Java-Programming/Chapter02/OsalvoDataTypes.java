/**
 * 
 * @author 	Thaddeus Osalvo
 *	Date	Auguest 31, 2020
 *	Purpose To display your name, age, and income to the console
 *			using different data types.
 */
public class OsalvoDataTypes {

	public static void main(String[] args) {
		// Local variables
		String myName;
		myName = "Thaddeus Osalvo";
		
		int myAge;	// declare the variable
		myAge = 25; // initialize the variable
		
		double monthlyIncome = 4812.63; // declare and initialize variable
		
		
		
		// Display my name
		System.out.print("My name is ");
		System.out.println(myName);
		
		// Display my age
		System.out.print("I am ");
		System.out.print(myAge);
		System.out.println(" years old");
		
		// Display my income using concatenation
		System.out.println("I make $" + monthlyIncome + " per month.");
		// I make $2000.0 per month.
		// concatenation - combining together
		
		// Display how old I will be in 10 years
		int futureAge = myAge + 10;
		System.out.println("In 10 years, I will be " + futureAge + " years old.");
		
		// Display how much I make in one year
		double annualSalary = monthlyIncome * 12;
		System.out.println("I will make $" + annualSalary + " this year.");
		System.out.println("My annual salary will be $"+ (monthlyIncome * 12) );
	}

}
