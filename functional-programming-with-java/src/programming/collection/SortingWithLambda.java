package programming.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithLambda {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(1);
		l.add(100);
		l.add(0);
		l.add(0);
		l.add(0);
		
		System.out.println("Insertion order: "+l);
		Collections.sort(l);
		System.out.println("Netural sorting: "+l);
		Collections.sort(l,(s1,s2)->(s1>s2)?-1:(s1<s2)?+1:0);
		System.out.println("Custom sorting: "+l);

	}

}
