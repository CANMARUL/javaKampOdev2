
public class Student extends User {
	private String email;
	private String className;
	private String number;

	public Student(int id, String userName, String password, String email, String className, String number) {
		super(id, userName, password);
		this.email = email;
		this.className = className;
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	

}
