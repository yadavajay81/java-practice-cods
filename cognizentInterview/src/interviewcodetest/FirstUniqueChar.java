package interviewcodetest;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {

	public static void main(String[] args) {
		System.out.println("First Non Repeted Char: "+firstNonRepetedChr("aabbccdeeffij"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String input = "swiss";
		
		System.out.println(firstUnique(input));
		
		

	}

	
	private static char firstUnique(String input) {
		
		if(input == null || input.isEmpty())
			return '_';
		
		Map<Character, Integer> mapChar = new LinkedHashMap<>();
		
		input.chars().mapToObj(c -> (char)c)
		.forEach(c -> mapChar.put(c, mapChar.getOrDefault(c, 0) + 1));
		
		System.out.println(mapChar);
		
		return mapChar.entrySet().stream().filter(c -> c.getValue() == 1)
				.map(Map.Entry<Character, Integer>::getKey)
				.findFirst()
				.orElse('_');
		
		
		

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	












































	private static char firstNonRepetedChr(String string) {
		
		if((string == null) || (string.isEmpty())) {
			return '_';
		}
		
		/*Map<Character, Integer> charCount = new LinkedHashMap<>();
		
		for(char c:string.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) +1);
		}
		
		System.out.println(charCount);
		
		for(Map.Entry<Character, Integer> e:charCount.entrySet()) {
			System.out.println(e);
			
			if(e.getValue() == 1)
				return e.getKey();
			
		}
		
		return '_';*/
		
		
		//using java 8
		Map<Character, Integer> mapChar = new LinkedHashMap<>();
		
		string.chars().mapToObj(c -> (char)c)
		.forEach(c -> mapChar.put(c, mapChar.getOrDefault(c, 0) +1));
		
		return mapChar.entrySet().stream()
				.filter(c -> c.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse('_');
	}

	

}
