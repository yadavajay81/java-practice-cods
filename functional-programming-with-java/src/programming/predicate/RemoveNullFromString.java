package programming.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullFromString {

	public static void main(String[] args) {
		String[] s = {"Ajay", "Mamta", "Srishti", "",null,"Shreya"};
		Predicate<String> p1 = s1->s1 != null && s1.length()!=0;
		
		ArrayList<String> al = new ArrayList<String>();
		for(String n:s) {
			if(p1.test(n)) {
				al.add(n);
				
			}
		}
		
		System.out.println("Removed null and empty from array: "+al);

	}

}
