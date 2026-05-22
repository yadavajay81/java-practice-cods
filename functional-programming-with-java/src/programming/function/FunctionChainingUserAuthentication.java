package programming.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChainingUserAuthentication {

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		try (Scanner se = new Scanner(System.in)) {
			System.out.println("Enter Username: ");
			String username = se.next();
			System.out.println("Enter Password: ");
			String pwd = se.next();
			Function<String, String> f1 = s->s.substring(0, 5);
			Function<String, String> f2 = s->s.toLowerCase();
			
			if((f1.andThen(f2).apply(username).equals("admin")) && 
					(f1.apply(pwd).equals("Admin"))) {
				System.out.println("User is valid");
				
			}else {
				System.out.println("Incorrect user name and password!");
			}
		}

	}

}
