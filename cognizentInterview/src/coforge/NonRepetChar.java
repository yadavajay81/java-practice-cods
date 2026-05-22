package coforge;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepetChar {
	
	public static void main(String args[]) {
		
		String str = "swiss";
		
		System.out.println(nonReptchr(str));
	}
	

	private static char nonReptchr(String str) {
		
		char[] ch = str.toCharArray();
		Map<Character, Integer> countChar = new LinkedHashMap<>();
		
		for(char c:ch) {
			countChar.put(c, countChar.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:countChar.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		
		
		return '\0';
	}
	
	
	}

	