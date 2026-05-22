package programming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(17);
		al.add(5);
		al.add(10);
		al.add(100);
		al.add(2);
		al.add(20);
		
		List<Integer> l = al.stream().filter(i->i>10 && i%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		//map to perform operation
		
		List<Integer> dl = al.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(dl);
		
		
		Integer min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min "+min);
		
		Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("max "+max);
		
		long count = al.stream().count();
		System.out.println("count "+count);
		
		long count1 = al.stream().filter(i3->i3>10 && i3%2==0).count();
		System.out.println("count1 "+count1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Integer min1 = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("MIN-> "+min1);
		
		
		
		
		

	}

}
