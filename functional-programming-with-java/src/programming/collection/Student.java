package programming.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("Shyam Bihari");
		s.add("Shyam Yadav");
		s.add("Shyam Kumar");
		s.add("Shyam Shingh");
		s.add("Shyam1 yadav");
		s.add("Shyam2 Yadav");
		
		//System.out.println(s);
		
		
		List<String> s1 = s.stream().filter(n->n.toLowerCase().contains("yadav")).collect(Collectors.toList());
		System.out.println(s1);

	}

}
