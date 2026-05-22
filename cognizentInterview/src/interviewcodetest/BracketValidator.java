package interviewcodetest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class BracketValidator {

	public static void main(String[] args) {
		String input = "{[(})]}";
		
		System.out.println(input.length());
		
		System.out.println(input+ " is : "+balancedOrNot(input));
		System.out.println(input+ " is formated? : "+isFormated(input));

	}

	private static String balancedOrNot(String input) {
		
		System.out.println(input.length());
		
		System.out.println(input);
		
		char[] inc = input.toCharArray();
		
		System.out.println(inc);
		int inclength = input.length();
		int newLength;
		
		if(inclength %2 ==0) {
			newLength =inclength/2; 
			System.out.println("here1");
		}else {
			System.out.println("here2");
			newLength =(inclength/2)+1; 
		}
		
		System.out.println(newLength);
		
		
		for(int i=0; i<=newLength; i++) {
			int revindex = inclength-i;
			
			System.out.println(inc[i]+" :: "+inc[revindex-1]);
			
			if(inc[i] == 0 || inc[revindex-1] == 0) {
				return "Unbalanced";
			} if(inc[i] == '{' && inc[revindex-1] != '}') {
				return "Unbalanced";
			} if(inc[i] == '[' && inc[revindex-1] != ']') {
				return "Unbalanced";
			} if(inc[i] == '(' && inc[revindex-1] != ')') {
				return "Unbalanced";
			}
			
			
		}			
		
		return "Balanced";
	}
	
	
	public static boolean isFormated(String input) {
		
        Deque<Character> stack = new ArrayDeque<>();
		
		Map<Character, Character> bracetPairs = new HashMap<>();
		
		bracetPairs.put(')', '(');
		bracetPairs.put('}', '{');
		bracetPairs.put(']', '[');
		
		for(char c:input.toCharArray()) {
			if(bracetPairs.containsValue(c)) {
				
				stack.push(c);
				
				
				
			}else if(bracetPairs.containsKey(c)) {
				if(stack.isEmpty() || stack.pop() != bracetPairs.get(c)) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
		
		
	}

}
