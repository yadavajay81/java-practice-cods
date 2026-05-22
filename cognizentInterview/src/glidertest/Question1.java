package glidertest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Question1 {
	
	public static void main (String[] args) {
		
		
		
		List<Integer> list = Arrays.asList (new Integer []{1,5,8,4,9,4,3}) ;
		
		
		Set<Integer> set = list.stream().collect(Collectors.toCollection(TreeSet::new)); 
		
		Set<Integer> setl = list.stream().collect (Collectors.toCollection(LinkedHashSet::new)); 
		Set<Integer> set2 = list.stream().collect (Collectors.toCollection (HashSet::new)); 
		
		
		set.forEach(System.out::print); 
		System.out.println() ; 
		
		
		setl.forEach(System.out::print) ; 
		System.out.println(); 
		set2.forEach (System. out::print); 
		System.out.println(); 
		
	}

}
