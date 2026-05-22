package coforge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,2,5,3);
		
		Set<Integer> dupSet = list.stream().filter(e -> 
		Collections.frequency(list, e)>1).collect(Collectors.toSet());
		
		System.out.println(dupSet);
	}
	
	

}
