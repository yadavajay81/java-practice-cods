package programming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntegerTest {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(2);al.add(20);al.add(12);al.add(3);al.add(0);
		al.add(4);al.add(1);al.add(6);al.add(23);al.add(67);

		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Filter: "+l);

		List<Integer> m = al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("Map: "+m);

		Long count = al.stream().count();
		System.out.println("Count: "+count);

		List<Integer> sl = al.stream().sorted().collect(Collectors.toList());
		System.out.println("Default sorting: "+sl);

		List<Integer> csl = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());	
		System.out.println("Custom sorting: "+csl);

		Integer min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Min value: "+min);

		Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max value: "+max);
		
		al.stream().forEach(i->System.out.println(i));

		al.stream().forEach(System.out::println);
		
		Integer[] arr = al.stream().toArray(Integer[]::new);
		for(int a:arr){
		System.out.println(a);
		}
		
		/**
		 * Apply stream for group of number
		 */
		Stream<Integer> s = Stream.of(9,99,999,9999,99999,999999);
		s.forEach(System.out::println);
		
		/**
		 * Apply stream for array
		 */
		
		Double[] d = {10.2,10.4,10.55,34.99};
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::println);

	}

}
