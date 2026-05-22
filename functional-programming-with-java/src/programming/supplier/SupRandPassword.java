package programming.supplier;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * generate 8 digit password that have digit on odd places and charactor(A-Z)
 * #$@ have at even places
 * 
 * @author yadav
 *
 */
public class SupRandPassword {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			Supplier<Integer> d = () -> (int) (Math.random() * 10);
			Predicate<Integer> p = k -> k % 2 == 0;
			String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = () -> str.charAt((int) (Math.random() * 29));

			String password = "";
			for (int i = 0; i < 8; i++) {
				if (p.test(i)) {
					password = password + d.get();
				} else {
					password = password + c.get();
				}
			}
			return password;
		};

		System.out.println("Password: " + s.get());
		System.out.println("Password: " + s.get());
		System.out.println("Password: " + s.get());
		System.out.println("Password: " + s.get());
		System.out.println("Password: " + s.get());
		System.out.println("Password: " + s.get());

	}

}
