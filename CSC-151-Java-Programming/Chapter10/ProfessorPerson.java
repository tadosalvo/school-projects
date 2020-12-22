/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 10, 2020
 * Purpose	To create a "generic" person class from which other objects
 * 			will inherit fields and methods
 *
 */
public class ProfessorPerson {
	
	
	
	// Fields Cannot access outside package
	protected String name;
	protected int IDnumber;
	
	// Constructor
	public ProfessorPerson() {
		this.name = "Unknown";
		this.IDnumber = 0;
	}
	
	public ProfessorPerson(String name, int id) {
		this.name = name;
		this.IDnumber = id;
		
	}
	
	public String toString() {
		String str = "";
		str += "My name is " + this.name + "\n";
		str += "My ID number is " + this.IDnumber + "\n";
		return str;
		
	}
	
	
}
