package programming.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateClass1 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Predicate<String> p = s->s.length()>5;
		
		
		Predicate<Collection> p1 = c->c.isEmpty();
		ArrayList l1 = new ArrayList();
		l1.add("a1");
		
		System.out.println(p.test("Ajay"));
		System.out.println(p.test("Ajay Bahadur"));
		
		System.out.println(p1.test(l1));
		
	}

}
