package programming.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;


public class StreamSorting {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(17);
		al.add(5);
		al.add(10);
		al.add(100);
		al.add(2);
		al.add(20);
		
		List<Integer> l = al.stream().sorted((i1,i2)->(i1>i2)?1:(i1<i2)?-1:0).collect(Collectors.toList());
		System.out.println(l);
		List<Integer> l1 = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l1);
		
		
		al.stream().forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
		
		
		
		//Sorting in assending order
		
		List<Integer> sorted = al.stream().sorted((i1, i2)->i1.compareTo(i2)).collect(Collectors.toList());
		
		
		System.out.println(sorted);
		
		
		
		
	}

}
