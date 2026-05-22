package programming.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Authenticate user using predicate
 * @author yadav
 *
 */
public class User {
	
	String username;
	String password;
	
	User(String username, String password){
		this.username = username;
		this.password = password;
		
	}
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/**
		 * define predicate
		 */
		Predicate<User> p = u->u.username.equals("Ajay") && 
				u.password.equals("Admin123");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
		
		
		String username = sc.next();
		System.out.print("Enter Password: ");
		String password = sc.next();
		
		User user = new User(username, password);
		
		if(p.test(user)) {
			System.out.println("Valid user That have access");
		}else {
			System.out.println("Invalid User ");
		}
		

	}

}
