package week3_homework2;

public class UserManager {

	public void login() {
		System.out.println("Sisteme baþarý ile giriþ yapýldý.");
	}
	public void logout() {
		System.out.println("Sistemden baþarý ile güvenli çýkýþ yapýldý.");
	}
	
	public void list(User[] users) {
		for (User user : users) {
			System.out.println(user.getFirstName());
		}
	}
	
}
