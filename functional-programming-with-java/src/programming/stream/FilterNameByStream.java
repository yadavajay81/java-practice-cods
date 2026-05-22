package programming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNameByStream {
	
	public static void main(String[] args) {
		
		
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ram");
		al.add("Venktesh");
		al.add("Chiranjivi");
		al.add("Krishna");
		al.add("Gpal");
		al.add("Ravi Teja");
		System.out.println(al);
		
		/**
		 * Filter
		 */
		List<String> l = al.stream().filter(s->s.length()>4).collect(Collectors.toList());
		
		System.out.println(l);
		/**
		 * Map
		 */
		List<String> l1 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l1);
		
		/**
		 * Count
		 */
		long count = l.stream().filter(s->s.length()>4).count();
		System.out.println(count);
		
		/**
		 * Sorted
		 * default sorting method
		 */
		
		List<String> sl = al.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted List: "+sl );
		
		
		/**
		 * Use sorted 
		 * use comprator
		 */
		
		List<String> cl = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		
		System.out.println("Custom Sorted List: "+cl);
		
		
		al.stream().forEach(i->System.out.println(i));

		al.stream().forEach(System.out::println);
		
		String[] arr = al.stream().toArray(String[]::new);
		for(String a:arr){
		System.out.println(a);
		}
		
	}
	
	

}
