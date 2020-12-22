/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 11, 2020
 * Purpose	To create a production worker class that extends the employee class.
 * 			Should hold an int shift
 * 			Should hold a double hourly pay rate
 */

public class OsalvoProductionWorker extends OsalvoEmployee{

	// Constants
	final int DAY_SHIFT = 1;
	final int NIGHT_SHIFT = 2;
	
	
	// Fields
	private int shift;
	private double hourlyPayRate;
	
	
	// Constructor with empty argument
	public OsalvoProductionWorker() {
		// super that calls the employee empty constructor
		super();
		this.shift = 0;
		this.hourlyPayRate = 0.0;
	}
	
	// Constructor with 5 arguements
	public OsalvoProductionWorker(String name, String number, String date, int shft, double rate) {
		// super that calls the employee constructor with args
		super(name, number, date);
		this.shift = shft;
		this.hourlyPayRate = rate;
		
	}
	
	// Accesor getters
	public int getShift() {
		return this.shift;
	}
	
	public double getHourlyPayRate() {
		return this.hourlyPayRate;
	}
	
	
	// Mutators setters
	public int setShift(int shft) {
		return this.shift = shft;
	}
	
	public double setHourlyPayRate(double rate) {
		return this.hourlyPayRate = rate;
	}
	
	// toString method
	public String toString() {
		// calls the toString in the employee class
		String str = super.toString() + "\n";
		if (shift == DAY_SHIFT)
			str += "Day Shift \n";
		else if (shift == NIGHT_SHIFT)
			str += "Night Shift \n";
		else
			str += "error \n";
		str += String.format("Hourly payrate $%.2f %n", this.hourlyPayRate);
		return str;
	}
	
}
