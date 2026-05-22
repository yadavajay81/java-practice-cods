package programming.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByString {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList(
			       "Milan",
			       "london",
			       "San Francisco",
			       "Tokyo",
			       "New Delhi"
			);
		
		/*cities.sort(Comparator.reverseOrder());
		System.out.println(cities);
		
		cities.sort(String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(cities);*/
		
		Collections.sort(cities, Comparator.reverseOrder());
		System.out.println(cities);

	}

}
