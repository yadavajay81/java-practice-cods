package interviewcodetest;

import java.util.Arrays;

public class TrimStringArray {
	
	public static void main(String[] args) {
		
		
		String[] words = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
		int removeNumberOfElement = 3;
        String[] result = removeFirstAndLast(words, removeNumberOfElement);

        System.out.println(Arrays.toString(result)); // [d, e, f]
		
	}

	private static String[] removeFirstAndLast(String[] words, int removeNumberOfElement) {
		if(words.length<=removeNumberOfElement)
		return null;
		
		
		
		String[] result = Arrays.copyOfRange(words, removeNumberOfElement, words.length - removeNumberOfElement);
		return result;
	}

}
