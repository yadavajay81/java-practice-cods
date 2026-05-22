package java8certification;

import java.util.Arrays;

public class WordCount {

	public static void main(String[] args) {
		String text ="Java is fun. Java is powerful. I love Java!";
		String word = "Java";
		System.out.println(word +" Count is: "+countOccurrences(text, word));

	}

	private static int countOccurrences(String text, String word) {
		
		if(text == null || word == null) return 0;
		
		int count = 0;
		
		word = word.toLowerCase();
		String[] words = text.toLowerCase().split("\\W+");
		System.out.println(Arrays.toString(words));
		
		for(String w : words) {
		if(w.equals(word)) {
			count++;	
		}
		}
		
		return count;
	}

}
