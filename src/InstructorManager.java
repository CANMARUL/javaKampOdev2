
public class InstructorManager extends UserManager {

	public void instructorAdd(Instructor[] instructor) {
		System.out.println("E � � T M E N  B � L G � L E R �\n");
			for(Instructor instructors: instructor) {
				
				System.out.println("E�itmen ismi: " + instructors.getUserName() + "|| E�itmen id: " + instructors.getId()
				+ "|| E�itmen �ifresi: " + instructors.getPassword() + "|| E�itmen r�tbesi: " + instructors.getGrade()
				+ "|| E�itim verdi�i alan: " + instructors.getEducationField());
			}
		
	}

}
