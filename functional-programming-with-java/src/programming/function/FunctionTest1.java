package programming.function;

import java.util.function.Function;

/**
 * Replace the blank spaces from string using function
 * count number of spaces from string using function
 * @author yadav
 *
 */
public class FunctionTest1 {

	public static void main(String[] args) {
		Function<String, String> f = s->s.replaceAll(" ","");
		
		System.out.println(f.apply(" Ajay     Bahadur "));
		
		
		/**
		 * count number of spaces from string using function
		 */
		
		Function<String, Integer> f1 = s1->s1.length() - s1.replaceAll(" ", "").length();
		System.out.println(f1.apply(" Ajay     Bahadur  "));

	}

}
