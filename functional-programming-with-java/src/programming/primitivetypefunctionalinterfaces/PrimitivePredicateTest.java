package programming.primitivetypefunctionalinterfaces;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/**
 * Primitive type predicate 
 * 3 types of primitive(IntPredicate,DoublePredicate,LongPredicate) predicate
 * @author yadav
 *
 */
public class PrimitivePredicateTest {

	public static void main(String[] args) {
		int[] x = {20,10,11,13,3,7,9,4};
		
		IntPredicate ip = i->i%2==0;
		LongPredicate lp = i->i%2==0;
		DoublePredicate dp = i->i%2==0;
		
		Predicate<Integer> p1 = l->l%2==0;
		
		
		System.out.println("********Int Predicate*******");
		long startTime1=System.nanoTime();
		for(int j:x) {
			if(ip.test(j)) {
				System.out.println(j+" Is even number.");
			}else {
				System.out.println(j+" Is odd number.");
			}
				
		}
		
		long TotalTime1=System.nanoTime() - startTime1;
		System.out.println("Total time taken to execute without Autoboxing/autounboxing: "+ TotalTime1);
		
		System.out.println("********Long Predicate*******");
		for(int j:x) {
			if(lp.test(j)) {
				System.out.println(j+" Is even number.");
			}else {
				System.out.println(j+" Is odd number.");
			}
				
		}
		
		System.out.println("********Double Predicate*******");
		for(int j:x) {
			if(dp.test(j)) {
				System.out.println(j+" Is even number.");
			}else {
				System.out.println(j+" Is odd number.");
			}
				
		}
		
		System.out.println("******** Predicate*******");
		
		long startTime=System.nanoTime();
		for(int j:x) {
			if(p1.test(j)) {
				System.out.println(j+" Is even number.");
			}else {
				System.out.println(j+" Is odd number.");
			}
				
		}
		long TotalTime=System.nanoTime() - startTime;
		System.out.println("Total time taken to execute with Autoboxing/autounboxing: "+ TotalTime);
		
		
		
		
		long timDiff=TotalTime-TotalTime1;
		System.out.println("Time difference: "+timDiff);

	}

}
