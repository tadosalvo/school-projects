/**
 * 
 * @author 	tlo
 * Date		November 10, 2020
 * Purpose	To create an instructor class that inherits from Person class
 * 
 */
public class ProfessorInstructor extends ProfessorPerson {

	private String department;
	private double annualSalary;
	
	public ProfessorInstructor() {
		super();
		this.department = "Unsure";
		this.annualSalary = 0.0;
		
		
	}
	
	public ProfessorInstructor(String name, int id, String dept, double salary) {
		super(name, id);
		this.department = dept;
		this.annualSalary = salary;
	}
	
	public double calcBonus() {
		double bonus = 500.0;
		if (this.department.equals("Software"))
			bonus = this.annualSalary * 0.1;
		return bonus;
	}
	
	public double calcBonus(double s1, double s2) {
		double bonus = 0.0;
		if ( s1 >= 3.0 && s2 >= 3.0) 
			bonus = this.annualSalary * 0.08;
		return bonus;
		
	}
	public String toString() {
		String str = super.toString(); // calls toString() from Person class
		str += "My department is " + this.department + "\n";
		// str += "My annual salary is $" + this.annualSalary + "\n";
		str += String.format("My annual salary is $%,.2f %n", this.annualSalary);
		str += String.format("My bonus is $%,.2f this year %n", calcBonus());
		return str;
		
	}
	
	
	
}
