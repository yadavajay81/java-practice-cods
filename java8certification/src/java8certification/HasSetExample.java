package java8certification;

import java.util.HashSet;

public class HasSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate
        System.out.println(set); // Output: [Apple, Banana]

	}
	
	
	
	

}


