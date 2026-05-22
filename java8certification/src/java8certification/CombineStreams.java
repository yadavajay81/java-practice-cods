package java8certification;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineStreams {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("A","B");
		List<String> l2 = Arrays.asList("C","D");
		
		
		List<String> employees = new ArrayList<>(List.of("Bob","Sam","William"));
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(employees);
		List<String> l3 = Stream.concat(l1.stream(), l2.stream())
				.collect(Collectors.toList());
		System.out.println(l3);
		
		List<String> combine = Stream.concat(l3.stream(), employees.stream())
									.collect(Collectors.toList());
		System.out.println(combine);
		
		
		
		List<String> names = Arrays.asList("Alice", "Bob", "Carol");
		names.forEach(name -> System.out.println(name));
		
		List<Integer> numbers = Arrays.asList(2,4,6,7,3,9,13,11,19,18);
		numbers.forEach(number ->isEven(number));
		
		
		List<Integer> numbers1 = Arrays.asList(2,4,5,8,3,9,1);
		List<Integer> square = numbers1.stream()
								.map(x -> x*x)
								.collect(Collectors.toList());
		System.out.println(square);
		
		square.forEach(System.out::println);
		
		//Optional
		//Avoid null pointer exceptions.
		
		Optional<String> optional = Optional.of("Hello");
		optional.ifPresent(System.out::println);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("partitioned===== "+partitioned);
		
		
		//filter even number
		 List<Integer> even = numbers.stream().filter(x->x%2==0)
				 .collect(Collectors.toList());
		 System.out.println(even);
		 
		 int max = numbers.stream().max(Integer::compare).orElseThrow();
		 
		 System.out.println(max);

	}

	private static void isEven(Integer number) {
		Predicate<Integer> iseven = x -> x % 2 == 0;
		// TODO Auto-generated method stub
		System.out.println(number+ " is even? "+iseven.test(number));
		}

}
