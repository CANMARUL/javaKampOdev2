
public class InstructorManager extends UserManager {

	public void instructorAdd(Instructor[] instructor) {
		System.out.println("E Ð Ý T M E N  B Ý L G Ý L E R Ý\n");
			for(Instructor instructors: instructor) {
				
				System.out.println("Eðitmen ismi: " + instructors.getUserName() + "|| Eðitmen id: " + instructors.getId()
				+ "|| Eðitmen þifresi: " + instructors.getPassword() + "|| Eðitmen rütbesi: " + instructors.getGrade()
				+ "|| Eðitim verdiði alan: " + instructors.getEducationField());
			}
		
	}

}
