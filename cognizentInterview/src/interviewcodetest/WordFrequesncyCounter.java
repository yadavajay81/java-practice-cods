package interviewcodetest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequesncyCounter {

	public static void main(String[] args) {
		String sentence = "Glider AI test is a Glider test";
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		Arrays.stream(sentence.toLowerCase().split("\\s+"))
		.forEach(c -> wordCount.put(c, wordCount.getOrDefault(c, 0) + 1));
		
		wordCount.forEach((key, value)-> System.out.println(key+" : "+value));
		
		
		wordCount.entrySet().stream()
		.forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));

	}

}
