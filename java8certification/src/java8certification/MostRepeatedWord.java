package java8certification;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedWord {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		
		Map<String, Long> wordCount = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		
		Map.Entry<String, Long> mostFrequesnt = wordCount.entrySet().stream()
													.max(Map.Entry.comparingByValue())
													.orElse(null);
		Map.Entry<String, Long> lessFrequent = wordCount.entrySet().stream()
												.min(Map.Entry.comparingByValue())
												.orElse(null);
		if(mostFrequesnt != null) {
			System.out.println("Most frequent element: "+mostFrequesnt.getKey());
			System.out.println("Count: "+mostFrequesnt.getValue());
		}
		
		if(lessFrequent != null) {
			System.out.println("Less frequent element: "+lessFrequent.getKey());
			System.out.println("Count: "+lessFrequent.getValue());
		}
			
		
		
		words.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
		
		List<String> language = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		language.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
		
		
		String str = "JaAVaA GUIDES";
		char remove = 'a';
		
		String result = str.chars().filter(ch -> ch != remove)
							.mapToObj(c -> String.valueOf((char)c))
							.collect(Collectors.joining());
		System.out.println(result);
				
		
		
		String str2 = "Wednesday";
		
		Map<Character, Long> charCount = str2.chars().mapToObj(c -> (char) c)
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
		
		charCount.entrySet().stream().filter(entry -> entry.getValue() > 1)
			.forEach(entry -> 
			System.out.println(entry.getKey()+" : "+entry.getValue())
			
					);
		
		
		/////////////check anagram///////
		String anstr1 = "secure";
		String anstr2 = "rescue";
		
		boolean isAnagram = (anstr1.length() == anstr2.length()) 
								&& (
								anstr1.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
								.equals(anstr2.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())))
									);
		
		
		if(isAnagram) {
			System.out.println(anstr1+" and "+anstr2+" is Anagram");
		}else {
			System.out.println(anstr1+" and "+anstr2+" is not Anagram");
		}
		
		
		
		Map<Character, Long> anstr1Map = anstr1.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(anstr1Map);
		
		Map<Character, Long> anstr2Map = anstr2.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(anstr2Map);
		
		String input = "Java is a programming language and Java is widely used in the software industry.";
		String result1 = Arrays.stream(input.split("\\s+")).collect(Collectors.toCollection(LinkedHashSet::new))
							.stream().collect(Collectors.joining(" "));


		
		System.out.println(result1);
		
		
		List<Integer> numInt = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> numInt1 = List.of(10,15,8,49,25,98,32);
		//print number which start with 1
		numInt.stream().map(String::valueOf).filter(num -> num.startsWith("1")).forEach(System.out::println);
		List<String> numInt2 = numInt1.stream().map(String::valueOf).filter(num -> num.startsWith("1")).collect(Collectors.toList());
		System.out.println(numInt2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       /* 
        List<String> words = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        
        Map<String, Long> wordCounts = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        
        System.out.println(wordCounts);
  
        Map.Entry<String, Long> mostFrequent = wordCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        
        if (mostFrequent != null) {
            System.out.println("Most Frequent Element : " + mostFrequent.getKey());
            System.out.println("Count : " + mostFrequent.getValue());
        }
        */
    }
}
