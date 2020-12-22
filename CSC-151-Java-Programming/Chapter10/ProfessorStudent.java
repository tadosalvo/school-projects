/**
 * 
 * @author 	tlo
 * Date 		November 10, 2020
 * Purpose	To create a student class that inherits from the Person class
 */
public class ProfessorStudent extends ProfessorPerson{

	private String collegeMajor;
	private double studentGpa;
	
	public ProfessorStudent() {
		super(); // calls the default constructor of the parent class (ProfessorPerson)
		this.collegeMajor = "undecided";
		this.studentGpa = 0.0;
	}
	
	public ProfessorStudent(String name, int id, String major, double gpa) {
		super(name, id); // calls the constructor of the parent class with two arguments
		this.collegeMajor = major;
		this.studentGpa = gpa;
		
	}
	
	public double getGPA() {
		return studentGpa;
	}
	
	public String toString() {
		String str = super.toString(); // calls toString() from Person class
		str += "My major is " + this.collegeMajor + "\n";
		//str += "My GPA is " + this.studentGpa + "\n";
		str += String.format("My GPA is %.3f %n", this.studentGpa);
		return str;
	}
	
}
