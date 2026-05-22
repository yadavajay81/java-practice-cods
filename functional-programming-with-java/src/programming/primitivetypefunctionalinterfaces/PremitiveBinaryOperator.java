package programming.primitivetypefunctionalinterfaces;

import java.util.function.IntBinaryOperator;

public class PremitiveBinaryOperator {

	public static void main(String[] args) {
		IntBinaryOperator b = (i1,i2)->i1+i2;
		
		System.out.println(b.applyAsInt(10, 200));

	}

}
