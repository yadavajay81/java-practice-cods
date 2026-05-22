package programming.BiFunctionalInterface;

import java.util.function.BiFunction;

/**
 * Use BiFunction Pass two integer in and return 
 * product of those 
 * @author yadav
 *
 */
public class BiFunctionEx {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> f=(a,b)->a*b;
		System.out.println(f.apply(100, 200));



	}

}
