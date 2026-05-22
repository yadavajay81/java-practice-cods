package programming.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UseComprator {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println("Before sorting "+l);
		
		Collections.sort(l);
		System.out.println("After sorting "+l);
		
		Collections.sort(l, new MyComprator());
		
		System.out.println("After Custom sorting "+l);

	}

}

class MyComprator implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2) {
//		if(i1>i2) {
//			return -1;
//		}else if(i1<i2) {
//			return +1;
//		}else {
//			return 0;
//		}
		return (i1>i2)?-1:(i1<i2)?+1:0;
	}
}