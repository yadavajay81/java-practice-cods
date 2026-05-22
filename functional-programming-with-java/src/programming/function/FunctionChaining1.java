package programming.function;

import java.util.function.Function;

/**
 * Example of function chaining
 * @author yadav
 *
 */
public class FunctionChaining1 {

	public static void main(String[] args) {
		int k = 2;
		Function<Integer, Integer> f1 = i->i+i;
		Function<Integer, Integer> f2 = i->i*i*i;
		System.out.println(f1.apply(k));
		System.out.println(f2.apply(k));
		System.out.println(f1.andThen(f2).apply(k));
		System.out.println(f1.compose(f2).apply(k));

	}

}
