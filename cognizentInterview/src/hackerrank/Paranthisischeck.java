package hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Paranthisischeck {

	public static void main(String[] args) {
		String input = "[{(])}]";
		
		System.out.println("Paranthisis is balanced: "+balancedChk(input));

	}

	private static boolean balancedChk(String input) {
		Map<Character, Character> pairs = Map.of(
				')','(',
				'}','{',
				']','['
				);
		
		Deque<Character> stack = new ArrayDeque<>();
		
		return input.chars().allMatch(ch -> {
			char c = (char) ch;
			
			if(pairs.containsValue(c)) {
				stack.push(c);
			}else if(pairs.containsKey(c)) {
				if(stack.isEmpty() || stack.pop() != pairs.get(c)) {
					return false;
				}
				return true;
			}
			return true;
			
		}) && stack.isEmpty();
		
	}

}
