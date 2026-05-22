package programming.collection;

import java.util.TreeMap;

public class TreeMapSorting {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100,"Ram");
		tm.put(10,"Ram1");
		tm.put(200,"Ram2");
		System.out.println("Netural sorting "+tm);
		
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		tm1.put(100,"Ram");
		tm1.put(10,"Ram1");
		tm1.put(200,"Ram2");
		System.out.println("Custom sorting "+tm1);

	}

}
