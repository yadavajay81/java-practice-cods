package programming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Radhamohan");
		al.add("Ram kumar");
		al.add("Ram");
		al.add("Radha");
		
		List<String> l = al.stream().filter(s->s.length()>=9).collect(Collectors.toList());
		System.out.println(l);
		
		
		long count = al.stream().filter(s->s.length()>=9).count();
		System.out.println("Count "+count);
		
		

	}

}
