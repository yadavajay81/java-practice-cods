package programming.function;

import java.util.function.Function;

/**
 * Example of function chaining
 * Function interface have a abstract method apply
 * and 2 default method andThen and compose
 * and 1 static method identity
 * @author yadav
 *
 */
public class FunctionChaining {

	public static void main(String[] args) {
		String str = "Ashirwayaabhi";
		Function<String, String> f1 = s->s.toUpperCase();
		Function<String, String> f2 = s->s.substring(0, 9);
		System.out.println(f1.apply(str));
		System.out.println(f2.apply(str));
		System.out.println(f1.andThen(f2).apply(str));
		System.out.println(f1.compose(f2).apply(str));

	}

}
