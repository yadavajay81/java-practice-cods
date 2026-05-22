package programming.supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * get system date using supplier
 * @author yadav
 *
 */
public class SuptestDate {

	public static void main(String[] args) {
		Supplier<Date> s = ()->new Date();
		
		
		System.out.println("Current System Date:");
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
