package javatest.interview;

import java.util.List;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * get max from list
 * using stream
 * @author yadav
 *
 */
public class HighestFromList {
	public static void main(String[] args){
		List<Integer> num = Arrays.asList(5,8,4,1,9,7,7,6,7,8);

		Integer max = num.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
		long count = num.stream().count();
		System.out.println(count);
		
		
		/**
		 * How do you get the highest number that exists on a list
		 */
		
		
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x)-> x).summaryStatistics();

		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Highest number in List : " + stats.getMax());
		
		
		IntSummaryStatistics st = numbers.stream().mapToInt(x->x).summaryStatistics();
		
		System.out.println("Avarage: "+st.getAverage());

	}


}
