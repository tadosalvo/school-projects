/**
 * 
 * @author 	tlo
 * Date		November 16, 2020
 * Purpose	To create a custom exception class
 * 
 */
public class ProfessorInvalidScore extends Exception{
	
	public ProfessorInvalidScore() {
		super("Invalid Score");
		
	}
	public ProfessorInvalidScore(int element, double score) {
		super("Element: " + element + " Score: " + score);
	}
	
}
