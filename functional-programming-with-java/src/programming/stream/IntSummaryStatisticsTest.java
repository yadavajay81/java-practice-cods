package programming.stream;

import java.util.List;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class IntSummaryStatisticsTest {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3,5,8,2,9,32,4);

		IntSummaryStatistics st = numbers.stream().mapToInt(x->x).summaryStatistics();

		System.out.println("max number: "+st.getMax());
		System.out.println("min number: "+st.getMin());
		System.out.println("AVG number: "+st.getAverage());
		System.out.println("Count number: "+st.getCount());
		System.out.println("Sum number: "+st.getSum());
		System.out.println("toString number: "+st.toString());

	}


}
