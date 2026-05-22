package programming.primitivetypefunctionalinterfaces;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class PrimitiveUnaryOperator {

	public static void main(String[] args) {
		IntUnaryOperator u = i->i*i;
		System.out.println(u.applyAsInt(6));
		
		LongUnaryOperator ul = i->i*i;
		System.out.println(ul.applyAsLong(6));
		
		DoubleUnaryOperator ud = i->i*i;
		System.out.println(ud.applyAsDouble(6));

	}

}
