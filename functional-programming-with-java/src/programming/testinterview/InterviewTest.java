package programming.testinterview;

import java.util.function.Predicate;

public class InterviewTest {
	
	public static void main(String[] args) {
		/*String s = "CloudTech#$%&^";
		int count = 0;
		String spclChrRemoved = "";
		for(int i=0; i<s.length();i++) {
			
			
			if(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				count++;
			}else {
				spclChrRemoved = spclChrRemoved+s.charAt(i);
			}
		}
		
		if(count>0) {
			System.out.println("Special character found");
		}
		System.out.println("String after removing special character: "+spclChrRemoved);
	
*/
	
	
	//using predicate
	
	Predicate<String> ps = s->{
		int count = 0;
		String spclChrRemoved = "";
		for(int i=0; i<s.length();i++) {
			
			
			if(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				count++;
			}else {
				spclChrRemoved = spclChrRemoved+s.charAt(i);
			}
		}
		
		if(count>0) {
			//System.out.println("Special character found");
			return true;
		}else {
			return false;
		}
		
		
		
	};
	
	if(ps.test("CloudTech")) {
		System.out.println("Special character found");
	}else {
		System.out.println("Special character not found");
	}
	
	

	// if a string is rotation of another string
	
	String s1 = "ABCD";
	String s2 = "CDABE";
	
	if(checkRotation(s1,s2)) {
		System.out.println("String " +s2+" is rotation of string "+s1 );
		
	}else {
		System.out.println("String " +s2+" is not rotation of string "+s1 );
	}
	
	
	}
	
	public static boolean checkRotation(String s1, String s2) {
		
		return ((s1.length()==s2.length()) &&((s1+s1).indexOf(s2)!=-1));
	}
	
	
	
	
	
}
