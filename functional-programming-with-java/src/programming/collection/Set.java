package programming.collection;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		
		h.add("Sunny");
		h.add("Bunny");
		h.add("Chinny");
		h.add("Sunny");
		
		System.out.println(h);

	}

}
