/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 16, 2020
 * Purpose	To create and object class that stores an array of test scores
 *
 */
public class ProfessorTestScores11 {

	private double[] scores;
	
	public ProfessorTestScores11(double[] s) throws ProfessorInvalidScore {
		scores = new double[s.length]; // create a new array for the object
		for (int cntr = 0; cntr < s.length; cntr ++) {
			scores[cntr] = s[cntr];
				if(s[cntr] < 0 || s[cntr] >100)
					throw new ProfessorInvalidScore(cntr,s[cntr]);
				else scores[cntr] = s[cntr];
		}
	}
	public double getAverage() {
		double total = 0.0;
		for (int cntr = 0; cntr < scores.length; cntr ++) {
			total += scores[cntr];
			
		}
		return total/ scores.length;
	}
	
	public char letterGrade() {
		double average = getAverage();
		if (average >= 90) return 'A';
		else if(average >= 80) return 'B';
		else if(average >= 70) return 'C';
		else if(average >= 60) return 'D';
		else return 'F';
		
		
	}
	
}
