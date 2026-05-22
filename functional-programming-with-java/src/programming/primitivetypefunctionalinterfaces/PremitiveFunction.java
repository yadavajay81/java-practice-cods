package programming.primitivetypefunctionalinterfaces;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

/**
 * 15 type premitive functions
 * IntFunction
 * @author yadav
 *
 */
public class PremitiveFunction {

	public static void main(String[] args) {
		/**
		 * input type int as defined in name 
		 * return type Integer 
		 * defined input type
		 */
		IntFunction<Integer> f	=	i->i*i;
		System.out.println(f.apply(20));
		
		DoubleFunction<Double> df	=	i->i*i;
		System.out.println(df.apply(20.00));
		
		LongFunction<Long> lf	=	i->i*i;
		System.out.println(lf.apply(20));
		
		
		
		/**
		 * input type string and return type int
		 * applyAsInt
		 * defined return type
		 * 
		 */
		
		ToIntFunction<String> tif	=	s->s.length();
		System.out.println(tif.applyAsInt("Ajay Yadav"));
		
		ToLongFunction<String> tlf	=	s->s.length();
		System.out.println(tlf.applyAsLong("Ajay Yadav"));
		
		ToDoubleFunction<String> tdf	=	s->s.length();
		System.out.println(tdf.applyAsDouble("Ajay Yadav"));
		
		/**
		 * IntToDoubleFunction input as int and return as double
		 * no need to define its define in name
		 * applyAsDouble
		 * input and return type both defined
		 */
		
		IntToDoubleFunction itdf	=	i->Math.sqrt(i);
		System.out.println(itdf.applyAsDouble(25));
		
		IntToLongFunction itlf	=	i->i*i;
		System.out.println(itlf.applyAsLong(25));
		
		DoubleToIntFunction dtif	=	i->(int)i;
		System.out.println(dtif.applyAsInt(25.6));
		
		DoubleToLongFunction dtlf	=	i->(long)i;
		System.out.println(dtlf.applyAsLong(25.6));
		
		
		LongToIntFunction ltif	=	i->(int)i;
		System.out.println(ltif.applyAsInt(25));
		
		LongToDoubleFunction ltdf	=	i->(double)i;
		System.out.println(ltdf.applyAsDouble(25));
		
		
		
		ToIntBiFunction<String,String> tibf	=	(s1,s2)->(s1.length())+(s2.length());
		System.out.println(tibf.applyAsInt("Ajay", "Yadav"));
		
		ToLongBiFunction<String,String> tlbf	=		(s1,s2)->(s1.length())+(s2.length());
		System.out.println(tlbf.applyAsLong("Ajay", "Yadav"));
		
		ToDoubleBiFunction<String,String> tdbf	=		(s1,s2)->(s1.length())+(s2.length());
		System.out.println(tdbf.applyAsDouble("Ajay", "Yadav"));
	

	}

}
