package java8certification;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {
	
	public static void main(String args[]) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.forEach(name->System.out.println(name));
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream()
		.filter(n -> n%2 == 0)
		.forEach(System.out::println);
		
		List<Integer> evNumber = numbers.stream()
		.filter(n -> n%2 == 0).collect(Collectors.toList());
		
		LinkedList<String> stack = new LinkedList<>();
		
		stack.push("Ajay");
		stack.push("Mamta");
		stack.push("Srishti");
		stack.push("Shreya");
		stack.push("Shreyas");
		
		System.out.println(stack.toString());
		String topPlate = stack.pop();
		System.out.println(topPlate);
		
		
	}

}
