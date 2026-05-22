package java8certification;

import java.util.Arrays;

public class LongestWordFinder {

	public static void main(String[] args) {
		 String sentence = "Java is a powerful and versatile programming language";
	        String longestWord = findLongestWord(sentence);
	        System.out.println("The longest word is: " + longestWord);

	}

	private static String findLongestWord(String sentence) {
		
		if(sentence == null || sentence.isEmpty()) return "";
		String longWord="";
		
		String[] words = sentence.split("\\s+");
		
		System.out.println(Arrays.toString(words));
		for(String word: words) {
			if(word.length()>longWord.length()) {
				longWord = word;
			}
		}
		
		return longWord;
	}

}
