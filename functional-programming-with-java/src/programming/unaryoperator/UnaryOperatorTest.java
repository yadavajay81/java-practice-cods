package programming.unaryoperator;

import java.util.function.UnaryOperator;

/**
 * Use unaryoperator to get square
 * @author yadav
 *
 */
public class UnaryOperatorTest {

	public static void main(String[] args) {
		UnaryOperator<Integer> u = i->i*i;
		
		System.out.println(u.apply(10));

	}

}
