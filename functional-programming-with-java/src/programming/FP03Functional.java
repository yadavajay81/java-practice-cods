package programming;

import java.util.Comparator;
import java.util.List;

public class FP03Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> cources = List.of("Spring", "Spring Boot", "API", "Microservices","AWS", "PCF", "Azure", "Docker", "Kubernetes");
		int sum = addListFunctional(numbers);
		System.out.println(sum);
		
		
		numbers.stream()
				.map(number -> number*number)
				.forEach(System.out::println);;
		
		///sum of numbers sqauare
		System.out.println(numbers.stream()
				.map(number -> number*number)
				.reduce(0, (x,y)->x+y));
		
		///sum of numbers qube
				System.out.println(numbers.stream()
						.map(number -> number*number*number)
						.reduce(0, (x,y)->x+y));
				
				///sum of odd numbers 
				System.out.println(numbers.stream()
						.filter(x -> x%2 !=0)
						.reduce(0, (x,y)->x+y));
				
				//Avoid duplicate
				System.out.println("Avoid duplicate");
				numbers.stream().distinct().forEach(System.out::println);
				
				//Sorted
				System.out.println("Sorted list");
				numbers.stream().sorted().forEach(System.out::println);
				
				//distinct Sorted
				System.out.println("Distinct Sorted list");
				numbers.stream().distinct().sorted().forEach(System.out::println);
				
				System.out.println("String Sorted list");
				cources.stream().sorted().forEach(System.out::println);
				System.out.println("String Sorted list Comparator.naturalOrder");
				cources.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
				System.out.println("String Sorted list Comparator.reverseOrder");
				cources.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
				
				System.out.println("Use own custom sorting");
				cources.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}

	private static int addListFunctional(List<Integer> numbers) {
	
		return numbers.stream()
		//.reduce(0, FP02Functional::sum);
		//.reduce(0, (x,y)->x+y);
		.reduce(0, Integer::sum);
	}
	
	@SuppressWarnings("unused")
	private static int sum (int a, int b) {
		return a + b;
	}
	

}
