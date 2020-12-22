/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 11, 2020
 * Purpose	To create a shift supervisor class that includes the following
 * 			Constructor with 4 arguments
 * 			Getters and setter methods appropriate for subclass
 * 			Method that adds additional 8% of salary as a bonus
 *			toString method that displays salary and bonus with proper symbols and 2 dec places
 */
public class OsalvoShiftSupervisor extends OsalvoEmployee {
	
	// Fields
	private double annualSalary;
	private double annualBonus;
	
	
	// Constructor with empty argument
	public OsalvoShiftSupervisor() {
		this.annualSalary = 0.0;
		this.annualBonus = 0.0;
	}
	
	// Constructor with arguments
	public OsalvoShiftSupervisor(String name, String number, String date, double salary) {
		super(name, number, date);
		this.annualSalary = salary;
	}
	
	
	// Calculates bonus by checking if 2 production workers work the same shift
	public double calcBonus(int p1, int p2) {
		double bonus = 0.0;
		if ((p1 == 1 && p2 == 1) || (p1 == 2 && p2 == 2))
			bonus = this.annualSalary * 0.08;
		this.annualBonus = bonus;
		return bonus;
	}
		
	

	// Accessor getters
	public double getAnnualSalary() {
		return this.annualSalary;
	}
	
	public double getAnnualBonus() {
		return this.annualBonus;
	
	}
		
		
	// Mutators setters
	public double setAnnualSalary(double salary) {
		return this.annualSalary = salary;
	}
	
	public double setAnnualBonus(double bonus) {
		return this.annualBonus = bonus;
	}	
	
		
	// toString method
	public String toString() {
		// calls the toString in the employee class
		String str = super.toString() + "\n";
		str += String.format("Yearly salary: $%,.2f %n", this.annualSalary);
		str += String.format("Yearly bonus: $%,.2f %n", this.annualBonus);		
		str += String.format("Yearly salary with bonus: $%,.2f %n", this.annualSalary + this.annualBonus);

		return str;
	}
	
}
