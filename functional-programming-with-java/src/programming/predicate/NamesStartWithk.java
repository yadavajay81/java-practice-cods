package programming.predicate;

import java.util.function.Predicate;

public class NamesStartWithk {

	public static void main(String[] args) {
		String[] name = {"Kumar", "Ram", "Kavis", "Ajay"};
		
		Predicate<String> namewithk = s->s.charAt(0)=='K';
		
		System.out.println("Name start with K" );
		
		
		for(String s:name) {
			if(namewithk.test(s)) {
				System.out.println(s);
			}
		}
		
		
		//m1(namewithk, name);

	}
	
	
	public static void m1(Predicate<String> namewithk, String[] name) {
		
		for(String s:name) {
			if(namewithk.test(s)) {
				System.out.println(s);
			}
		}
		
	}

}
