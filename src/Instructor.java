
public class Instructor extends User {
	private String educationField;
	private String grade;

	public Instructor(int id, String userName, String password, String educationField, String grade) {
		super(id, userName, password);
		this.grade = grade;
		this.educationField = educationField;

	}

	public String getEducationField() {
		return educationField;
	}

	public void setEducationField(String educationField) {
		this.educationField = educationField;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
