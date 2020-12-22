/**
 * 
 * @author 	Thaddeus Osalvo
 * Date		November 10, 2020
 * Purpose	To demonstrate my Person, Student, Instructor object classes
 *
 */
public class ProfessorClassroomDemo {

	public static void main(String[] args) {
		// Local variables
		ProfessorStudent idk = new ProfessorStudent();
		ProfessorStudent maria = new ProfessorStudent("Maria", 123, "Comp Sci", 4.0);
		ProfessorInstructor rich = new ProfessorInstructor("Richard", 729, "Software", 1450000);
		ProfessorPerson court = new ProfessorStudent("Courtney" , 345, "History", 3.1415926);
		ProfessorStudent thad = new ProfessorStudent("Thaddeus", 915, "Physics", 3.5);
		ProfessorInstructor omar = new ProfessorInstructor("Omar", 456, "English", 65000);
		maria.name = "Barbara";
		
		// Display student information
		System.out.println(idk);
		System.out.println(maria);
		System.out.println(rich);
		System.out.println(court);
		System.out.println(omar);
		
		double student1 = maria.getGPA();
		double student2 = thad.getGPA();
		
		double omarBonus = omar.calcBonus(student1, student2);
		System.out.printf("Omar's extra bonus is %,.2f", omarBonus);
	}

}
