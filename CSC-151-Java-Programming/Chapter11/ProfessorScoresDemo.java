
public class ProfessorScoresDemo {

	public static void main(String[] args) throws ProfessorInvalidScore {
		// Local arrays
		double badScores[] = {97.5, 66.7, 88, 120, 99};
		double goodScores[] = {97.5, 66.7, 88, 100, 99};
		
		
		// Try to calculate the average of the bad array
		try {
			ProfessorTestScores11 bad = new ProfessorTestScores11 (badScores);
			System.out.printf("The average of the bad scores is %.2f", bad.getAverage());
			System.out.println("Your letter grade is " + bad.letterGrade());
			
		} catch (ProfessorInvalidScore e) {
			System.out.println("Bad score found: " + e.getMessage());
		}
		// Try to calculate the average of the good array
		try {
	
			ProfessorTestScores11 good = new ProfessorTestScores11 (goodScores);
			System.out.printf("The average of the good scores is %.2f %n", good.getAverage());
			System.out.println("Your letter grade is " + good.letterGrade());
		} catch (IllegalArgumentException ie) {
			System.out.println("Bad score found: " + ie.getMessage());
		}
	}
}
