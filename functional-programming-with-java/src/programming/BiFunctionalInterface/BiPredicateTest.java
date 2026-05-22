package programming.BiFunctionalInterface;

import java.util.function.BiPredicate;

/**
 * Use Bi Predicate to pass two argument
 * and check add of those is even or odd
 * @author yadav
 *
 */

public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0;
		
		
		
		if(p.test(10, 16)) {
			System.out.println("Addition of given number is even.");
		}else {
			System.out.println("Addition of given number is odd.");
		}

	}

}
