
public class StudentManager extends UserManager {

	public void studentAdd(Student [] student) {
		System.out.println("� � R E N C �  B � L G � L E R �\n");
		for(Student students: student) {
			
			System.out.println("��renci ismi: " + students.getUserName() + "|| ��renci id: " + students.getId()
			+ "|| ��renci Numaras� : " + students.getNumber() + "|| ��renci Email: " + students.getEmail()
			+ "|| ��renci s�n�f�: " + students.getClassName());
		}
		
	}

}
