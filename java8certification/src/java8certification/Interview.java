package java8certification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Interview {

	public static void main(String[] args) {
		
		List<Integer> primeNumber = IntStream.range(0, 50).filter(i -> i % 2 !=0)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(primeNumber);
		
		ArrayList<String> a = new ArrayList<>();
		a.add("car");
		a.add("racecar");
		a.add("banana");
		a.add("ram");
		a.add("madam");
		String l = "c";
		
		//{"car", "racecar", "banana", "ram", "madam"};
		
		List<String> str1 = a.stream().filter(s->s.charAt(0) == l.charAt(0))
				.collect(Collectors.toList());
		
		
		
		System.out.println(str1);
		
		
		
		String str[]= {"car", "racecar", "banana", "ram", "madam"};
		
		for(String strNew:str) {
			if(pal(strNew)) {
				System.out.println(strNew +" is palindrome");
				
				
				
			}else {
				System.out.println(strNew +" not palindrome");
			}
			
		}
		
		
	}
	
	public static boolean pal(String str) {
		
		int backIndex=str.length()-1;
		int frontIndex = 0;
		while(backIndex>frontIndex) {
			
			if(str.charAt(frontIndex)!=str.charAt(backIndex)) {
				return false;
			}
			
			frontIndex++;
			backIndex--;
			
		}
		
		
		return true;
	}

}
