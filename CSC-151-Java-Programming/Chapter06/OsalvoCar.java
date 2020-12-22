/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		October 11, 2020
 * Purpose	To make a car object and calls the accelerate and brake method 5 times
 *
 */
public class OsalvoCar {
		
		// fields
		private int yearModel;
		private String make;
		private int speed;
		
		// Car constructor that accepts the car's year model and make as arguments
		public OsalvoCar(int newYearModel, String newMake) {
			yearModel = newYearModel;
			make = newMake;
			speed = 0;
		}
		
		// Accessors for year model, make, and speed
		public int getYearModel() {
			return yearModel;
		}
		public String getMake() {
			return make;
		}
		public int getSpeed() {
			return speed;
		}
		
		// Methods that calculate acceleration and break speed
		public void accelerate() {
			speed = speed + 5;
		}
		public void brake() {
			speed = speed - 5;
		}

		public static void main(String[] args) {
			
			// Creates Car object
			OsalvoCar newCar = new OsalvoCar(2020, "Car Make");
			
			// Calls the accelerate and brake method 5 times
			for(int i = 0; i < 5; i++) {
				newCar.accelerate();
				System.out.println(newCar.getSpeed());
			}
			for(int i = 0; i < 5; i++) {
				newCar.brake();
				System.out.println(newCar.getSpeed());
			}
			
		}
		
}




