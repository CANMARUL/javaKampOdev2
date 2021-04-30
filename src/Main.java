
public class Main {

	public static void main(String[] args) {
	
	Student student1 = new Student(1,"Fahri Can", "fahri123","fahrimarull@icloud.com", "c", "754");
	Student student2  = new Student(2,"Bahadır", "bahadır345", "bahadırversan@icloud.com","c" , "761");
	Student[] students = {student1,student2};
	
	Instructor instructor1 = new Instructor(1, "Engin", "engin678", "Yazılım eğitimi", "Prof");
	Instructor[] instructors = {instructor1};
	
	UserManager userStudent = new StudentManager();
	userStudent.userAdd(students);
	System.out.println("*********************************************************************************************************");
	UserManager userInstructor = new InstructorManager();
	userInstructor.userAdd(instructors);
	
	
	System.out.println("*********************************************************************************************************");
	
	StudentManager studentManager = new StudentManager();
	studentManager.studentAdd(students);
	
	System.out.println("*********************************************************************************************************");
	InstructorManager instructorManager = new InstructorManager();
	instructorManager.instructorAdd(instructors);
	
	



	}

}
