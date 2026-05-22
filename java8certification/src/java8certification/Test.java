package java8certification;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person{
	Person(String s, int i){
		++pid;
		name=s;
		age=i;
	}
	static int pid;
	int age;
	String name;
}

public class Test implements A1,B1 {
	
	@Override
	public void print() {
		System.out.println("Z");
		A1.super.print();
		B1.super.print();
		
	}
	

	public static void main(String[] args) {
		
		String result = Stream.of("J", "a", "v", "a")
                .collect(Collectors.joining());
System.out.println(result);
		
		Optional<String> opt2 = Optional.ofNullable(null);
        System.out.println(opt2.orElse("Default Value"));
		
		IntStream.rangeClosed(1, 5)
        .filter(x -> x % 2 == 0)
        .forEach(System.out::print);
		System.out.println();
		
		
		Optional<String> opt1 = Optional.empty();
        System.out.println(opt1.orElse("Default"));
		
		
		
		Stream.of("A","B","C")
		 		.map(String::toLowerCase)
		 		.forEach(System.out::print);
		System.out.println();
		
		List<String> str1 = Stream.of("A","B","C")
 		.map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(str1);
		
		Function<Integer, String> func = s -> s > 10 ? "Greator" : "Smaller";
		
		System.out.println(func.apply(15));
		
		
		
		List<String> list = Arrays.asList("a","b","c");
		list.forEach(System.out::print);
		System.out.println();
		
		
		
		Optional<String> opt = Optional.of("Java");
		System.out.println(opt.orElse("Python"));
		
		
		new Test().print();
		
		Predicate<String> pr1 = s->s.isEmpty();
		Predicate<String> pr2 = s -> s.length()>5;
		String str = "Oracle";
		
		System.out.println(pr1. or (pr2).test(str));
		
		IntStream.range(1, 5).forEach(System.out::print);
		System.out.println();
		
		
		
		
		Person p1 = new Person("Jhon", 22);
		System.out.println(p1.pid+" "+p1.name+" "+p1.age);
		
		Test te = new Test();
		
		Person p2 = te.change(p1);
		
		System.out.println(p2.pid+" "+p2.name+" "+p2.age);
		System.out.println(p1.pid+" "+p1.name+" "+p1.age);
		
		
		
		
		
		String s = "Java";
		s.concat(" SE 6");
		s.replace('6', '7');
		
		//s.toLowerCase();
		System.out.print(s);
		
	}
	
	private Person change(Object o) {
		Person p2 = (Person)o;
		p2.age = 25;
		return p2;
	}
	
	
	
	
	
	
	
	
	
	
	
	/*public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int []a = {1,2,3,4,5,6};
		int i = a.length - 1;
		while(i>=0) {
			System.out.println(a[i]);
			i--;
		}

	}*/

}

interface A1{
	default void print() {
		System.out.println("A1");
	}
}
interface B1{
	default void print() {
		System.out.println("B1");
	}
}
