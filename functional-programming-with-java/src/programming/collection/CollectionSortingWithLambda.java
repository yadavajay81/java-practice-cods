package programming.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortingWithLambda {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(20);
		l.add(15);
		l.add(5);
		l.add(25);
		
		System.out.println("Before Sorting: "+l);
		
		Collections.sort(l);
		System.out.println("After netural Sorting: "+l);
		
		Collections.sort(l,(s1,s2)->(s1>s2)?-1:(s1<s2)?+1:0);
		System.out.println("After custom Sorting: "+l);
		
		
		
		ArrayList<String> str = new ArrayList();
		str.add("Ajay");
		str.add("Mamta");
		str.add("Srishti");
		str.add("Shreya");
		str.add("Shreyas");
		
		System.out.println("Befotre sorting: "+str);
		
		Collections.sort(str);
		System.out.println("After natural sorting: "+str);
		
		
		Collections.sort(str, (s1, s2)->s1.compareTo(s2));
		System.out.println("After natural sorting: "+str);
		
		Collections.sort(str, (s1, s2)->s2.compareTo(s1));
		System.out.println("After Custom sorting: "+str);

	}

}
