package hcl;

import java.util.HashMap;
import java.util.Map;

public class EmpwithouthashcodeoverDemo {

	public static void main(String[] args) {
		Map<Empwithouthashcodeover, String> hm = new HashMap<>();
		
		Empwithouthashcodeover e1 = new Empwithouthashcodeover(101, "Ajay");
		Empwithouthashcodeover e2 = new Empwithouthashcodeover(101, "Ajay");
		
		hm.put(e1, "Developer");
		hm.put(e2, "Software Developer");
		
		System.out.println("Map size: "+ hm.size());
		System.out.println(hm);

	}

}
