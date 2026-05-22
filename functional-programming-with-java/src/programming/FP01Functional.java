package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,13,15);
		List<String> cources = List.of("Spring", "Spring Boot", "API", "Microservices","AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		
        System.out.println("All Numbers:->");
        numbers.stream()
		.forEach(System.out::println);
        
		System.out.println("All Even:->");
		numbers.stream()
		.filter(number -> number%2==0)
		.forEach(System.out::println);
		
		System.out.println("Square of All Even:->");
		numbers.stream()
		.filter(number -> number%2==0)
		.map(number -> number*number)
		.forEach(System.out::println);
		
		System.out.println("All Odd:->");
		numbers.stream()
		.filter(number -> number%2 !=0)
		.forEach(System.out::println);
		
		System.out.println("Qube of All Odd:->");
		numbers.stream()
		.filter(number -> number%2!=0)
		.map(number -> number*number*number)
		.forEach(System.out::println);
		
		
		System.out.println(numbers.stream()
				.map(number->number*number)
				.reduce(0, (x, y)->x+y));
		
		
		
		///sum of numbers sqauare
		numbers.stream()
		.map(number -> number*number)
		.reduce(0, (x,y)->x+y);
		
		
		
		
		
		
		
		
		
		
		System.out.println("Start for cources->----------");
				
		System.out.println("Print All cources:->");
		cources.stream()
		.forEach(System.out::println);
		
		System.out.println("Print length of All cources:->");
		cources.stream()
		.map(length ->length.length())
		.forEach(System.out::println);
				
		System.out.println("Cources have Spring:->");
		cources.stream()
		.filter(cource -> cource.contains("Spring"))
		.forEach(System.out::println);
		
		System.out.println("Cources atleast have 4 letters:->");
		cources.stream()
		.filter(cource->cource.length()>=4)
		.forEach(System.out::println);
	}

	
	

	

}
