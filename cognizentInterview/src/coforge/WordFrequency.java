package coforge;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequency {
	
	public static void main(String args[]) {
	
	String word = "java spring java backend spring java";
	
	wordFreq(word);
	}

	private static void wordFreq(String word) {
		String[] wordArr = word.split(" ");
		Map<String, Integer> countWord = new LinkedHashMap<>();
		
		for(String str:wordArr) {
			countWord.put(str, countWord.getOrDefault(str, 0)+1);
		}
		
		countWord.forEach((k, v)->{
			System.out.println(k +"->"+v);
		});
		
	}

}
