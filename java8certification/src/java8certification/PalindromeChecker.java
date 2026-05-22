package java8certification;

public class PalindromeChecker {

	public static void main(String[] args) {
		 String input = "9A man, a p5lan, a canal: 5Panama9";
		
		 System.out.println("Is palindrome: "+ checkPalindrom(input));

	}

	private static boolean checkPalindrom(String input) {
		
		
		System.out.println(input);
		input = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(input);
		
		int left = 0;
		int right = input.length()-1;
		
		while(left < right) {
			
			
			if(input.charAt(left) != input.charAt(right)) {
				return false;
			}
		left++;
		right--;}
		
		return true;
	}

}
