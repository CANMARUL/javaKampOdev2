
public class UserManager {

	public void userAdd(User[] user) {
		System.out.println("K U L L A N I C I  B Ý L G Ý L E R Ý\n");
		for(User users: user) {
			System.out.println("Kullanýcý ismi: " + users.getUserName() + "||Kullanýcý id: " + users.getId()
			+ "|| Kullanýcý þifresi: " + users.getPassword());
		}
	
	}

}
