package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
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
