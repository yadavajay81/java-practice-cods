package interviewcodetest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InterviewPrepration {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ajay", "Mamta", "Srishti", "Shreya", "Shreyas", "Merry");
		names.stream().filter(name -> name.startsWith("S")).forEach(System.out::println);
		System.out.println("=====================");
		names.stream().sorted((s1, s2) ->s1.compareTo(s2)).forEach(System.out::println);
		System.out.println("=====================");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("=====================");
		names.stream().sorted((s1, s2) ->s2.compareTo(s1)).forEach(System.out::println);
		System.out.println("=====================");
		
		names.stream().sorted(Comparator.reverseOrder() ).forEach(System.out::println);
		System.out.println("=====================");
		
		names.stream().sorted().forEach(System.out::println);
		System.out.println("=====================");
		
		

	}

}
