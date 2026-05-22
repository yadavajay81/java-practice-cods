package programming.collection;

import java.util.TreeSet;

public class TreeSetSorting {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(20);
		t.add(2);
		t.add(200);
		t.add(40);
		t.add(30);
		t.add(10);
		System.out.println("Without passing comparator: "+t);
		
		TreeSet<Integer> t1 = new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		t1.add(20);
		t1.add(2);
		t1.add(200);
		t1.add(40);
		t1.add(30);
		t1.add(10);
		System.out.println("With passing comparator: "+t1);

	}

}
