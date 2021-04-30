
public class StudentManager extends UserManager {

	public void studentAdd(Student [] student) {
		System.out.println("Ö Ğ R E N C İ  B İ L G İ L E R İ\n");
		for(Student students: student) {
			
			System.out.println("Öğrenci ismi: " + students.getUserName() + "|| Öğrenci id: " + students.getId()
			+ "|| Öğrenci Numarası : " + students.getNumber() + "|| Öğrenci Email: " + students.getEmail()
			+ "|| Öğrenci sınıfı: " + students.getClassName());
		}
		
	}

}
