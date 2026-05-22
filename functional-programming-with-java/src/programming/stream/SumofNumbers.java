package programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumofNumbers {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,5,8,9,5,4,40,80);
		
		Optional<Integer> sum = num.stream().reduce((a,b) -> a+b);
		System.out.println("Sum of Num Array: "+sum);
		
		System.out.println("Filter even number ");
		List<Integer> evenNumber = num.stream().filter(a -> a%2 ==0)
				.collect(Collectors.toList());
		
		System.out.println(evenNumber);

	}

}
