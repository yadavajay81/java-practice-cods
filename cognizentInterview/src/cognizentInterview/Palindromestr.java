package cognizentInterview;

import java.util.ArrayList;

public class Palindromestr {

	public static void main(String[] args) {
		String strs[] = {"car", "racecar", "banana", "ram", "madam"};
		ArrayList<String> pStrs = new ArrayList<>();
		
		for(String str : strs) {
			int strStart=0;
			int strEnd=str.length()-1;
			
			//System.out.println(str);
			for(int i=0;  i<=str.length()-1; i++) {
			
			//System.out.println(str.charAt(strStart));
			
			//System.out.println(str.charAt(strEnd));
			
			if(str.charAt(strStart)!=str.charAt(strEnd)) {
				System.out.println(str+" Not Palindrome String");
				break;
			}else {
				if(strStart==strEnd) {
					pStrs.add(str);
				System.out.println(str+"  Palindrome String");
			}
			}
			
			strStart++;
			strEnd--;}
				
				
			
			
			
		}
		
		

	}
	
	
	public static boolean chkp(String str) {
		
		int fwd = 0;
		int bcw = str.length()-1;
		
		while(bcw>fwd) {
			if(str.charAt(bcw--)!=str.charAt(fwd++)) {
				return false;
			}
			
		}
		
		return true;
		
	}

}
