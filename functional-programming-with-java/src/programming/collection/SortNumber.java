package programming.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortNumber {
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(50);
		l.add(3);
		l.add(1);
		l.add(100);
		
		//Assending order
		Collections.sort(l);
		System.out.println(l);
		
		//Decending order
		
		Collections.sort(l, (i1, i2)->(i1>i2)?-1:(i1<i2)?1:0);
		System.out.println(l);
	}

}
