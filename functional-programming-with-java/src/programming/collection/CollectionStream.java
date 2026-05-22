package programming.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class CollectionStream {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l.add(1);
		l.add(10);
		l.add(3);
		l.add(20);
		l.add(16);
		l.add(50);
		l.add(11);
		l.add(102);
		l.add(33);
		l.add(204);
		l.add(164);
		l.add(500);
		
		System.out.println(l);
		
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		
		for(int l3:l) {
			if(l3%2==0) {
			l4.add(l3);	
			}
		}
		System.out.println(l4);

	}

}
