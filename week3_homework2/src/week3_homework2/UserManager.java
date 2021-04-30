package week3_homework2;

public class UserManager {

	public void login() {
		System.out.println("Sisteme ba�ar� ile giri� yap�ld�.");
	}
	public void logout() {
		System.out.println("Sistemden ba�ar� ile g�venli ��k�� yap�ld�.");
	}
	
	public void list(User[] users) {
		for (User user : users) {
			System.out.println(user.getFirstName());
		}
	}
	
}
