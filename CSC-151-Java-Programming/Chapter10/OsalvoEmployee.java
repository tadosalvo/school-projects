/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 11, 2020
 * Purpose	To design a class that has the following info
 * 			Employee name
 * 			Employee number in format XXX-L
 * 			Hire date
 *
 */
public class OsalvoEmployee {

	// Fields
	private String employeeName;
	private String employeeNumber;
	private String hireDate;
	
	// Constructor
	public OsalvoEmployee() {
		this.employeeName = "none";
		this.employeeNumber = "XXX-L";
		this.hireDate = "none";
	}
	
	public OsalvoEmployee(String name, String number, String date) {
		this.employeeName = name;
		this.employeeNumber = number;
		this.hireDate = date;
	}
	
	
	// Accesor getters
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public String getEmployeeNumber() {
		return this.employeeNumber;
	}
	
	public String getHireDate() {
		return this.hireDate;
	}
	
	// Mutators setters
	public String setEmployeeName(String name) {
		return this.employeeName = name;
	}
	
	public String setEmployeeNumber(String number) {
		return this.employeeNumber = number;
	}
	
	public String setHireDate(String date) {
		return this.hireDate = date;
	}
	
	// toString method
	public String toString() {
		String str = "";
		str += "Employee name: " + this.employeeName + "\n";
		str += "Employee number: " + this.employeeNumber + "\n";
		str += "Employee hire date: " + this.hireDate;
		return str;
	}
	
	
	
}



