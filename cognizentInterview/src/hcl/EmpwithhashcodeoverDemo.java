package hcl;

import java.util.HashMap;
import java.util.Map;

public class EmpwithhashcodeoverDemo {

	public static void main(String[] args) {
		Map<Empwithhashcodeover, String> hm = new HashMap<>();
		
		Empwithhashcodeover e1 = new Empwithhashcodeover(101, "Ajay");
		Empwithhashcodeover e2 = new Empwithhashcodeover(101, "Ajay");
		
		hm.put(e1, "Developer"); 
		hm.put(e2, "Software Developer"); 
		
		System.out.println("Map Size: "+hm.size());
		System.out.println(hm);

	}

}
