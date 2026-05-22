package factorypattern1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class VechileFactoryDemo1 {

	public static void main(String[] args) {
		Vechile1 car = Vechilefactory1.getVachile("Car");
		car.drive();
		
		Vechile1 moter = Vechilefactory1.getVachile("Motercycle");
		moter.drive();
		
		List<Integer> numbers = Arrays.asList(1,2,5,7,8,3);
		
		List<Integer> square = numbers.stream()
				.filter(n -> n >1)
				.map(n -> n*n)
				.collect(Collectors.toList());
		
		System.out.println(square);
		
		List<String> name = Arrays.asList("Ram", "Shyam", "Mohan", "Sohan");
		
		name.forEach(n -> System.out.println("Hello "+n));
		
		System.out.println(name);
		
		Collections.sort(name, (a, b)->a.compareTo(b));
		
		System.out.println(name);
		
		//Thread creation
		Thread thread = new Thread(() -> System.out.println("Thread started"));
		thread.start();
		
		String str = "Thread started";
		String result = str.toUpperCase();
		System.out.println(result);
		
		//Filter with Stream
		
		ArrayList<Integer> i = new ArrayList<>();
		i.add(4);
		i.add(3);
		i.add(9);
		i.add(8);
		
		List<Integer> even = i.stream().filter(a -> a%2==0).collect(Collectors.toList());
		even.forEach(b->System.out.println(b));

	}

}
