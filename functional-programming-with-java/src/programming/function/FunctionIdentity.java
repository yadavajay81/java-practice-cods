package programming.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionIdentity {

	public static void main(String[] args) {
		
		
		String m= inputStr();
		System.out.println(m);
		

	}

	private static String inputStr() {
		Function<String, String> f = Function.identity();
		try (Scanner se = new Scanner(System.in)) {
			System.out.println("Enter here: ");
			
			String str = se.next();
			String str1 = f.apply(str);
			return str1;
		}
	}

}
