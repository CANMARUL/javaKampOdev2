
public class UserManager {

	public void userAdd(User[] user) {
		System.out.println("K U L L A N I C I  B � L G � L E R �\n");
		for(User users: user) {
			System.out.println("Kullan�c� ismi: " + users.getUserName() + "||Kullan�c� id: " + users.getId()
			+ "|| Kullan�c� �ifresi: " + users.getPassword());
		}
	
	}

}
