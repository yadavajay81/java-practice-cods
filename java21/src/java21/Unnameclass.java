package java21;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unnameclass{
	
public static void main(String[] args) {
	
	String input = "madama";
	
	System.out.println(input + " is palindrom: "+ isPalindrom(input));
	
	
	
	List<String> words = List.of("apple", "banana");

	List<String> flatMapped = words.stream()
	    .flatMap(word -> Arrays.stream(word.split("")))
	    .toList();  // Result: List<String>
	
	System.out.println(flatMapped);
	
	
	List<Stream<String>> mapped = words.stream()
		    .map(word -> Arrays.stream(word.split("")))
		    .toList(); 
	
	System.out.println(mapped);
	
	
	
	
	List<String> wordsL = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
	
	Map<String, Long> sCount = wordsL.stream().collect(Collectors.groupingBy(word->word,
			Collectors.counting()));
	System.out.println(sCount);
	
	Map.Entry<String, Long> mostFrequent = sCount.entrySet().stream().max(
			Map.Entry.comparingByValue()).orElse(null);
	
	if(mostFrequent != null) {
		System.out.println("Most repeted word: "+mostFrequent.getKey()+" Reeted: "+ mostFrequent.getValue());
	}
    
}

private static Boolean isPalindrom(String input) {
	if(input == null || input.isBlank() || input.isEmpty() )
		throw new IllegalArgumentException("Input not valid!");
	
	char[] strchar = input.toCharArray();
	int start = 0;
	int end = strchar.length - 1;
	
	for(int i = start; i<=end; i++) {
		if(strchar[start] != strchar[end]) {
			return false;
		}
		start++;
		end--;
	}
	
	return true;
}

}