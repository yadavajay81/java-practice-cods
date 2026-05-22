package cognizentInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {
	
	public static String str = "racecar";

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(str));
		
		System.out.println(pl("ajay"));
		
		
		String[] str = {"ajay","car","banana","racecar","madam"};
		
		String[] polidromeStr;
		polidromeStr= new String[5];
		int i=0;
		for(String strNew:str) {
			//System.out.println(strNew);
			
			if(chkp(strNew)) {
			polidromeStr[i]=strNew;
			i++;
			}
			
			
		}
		
		for(String pstr:polidromeStr) {
		
		System.out.println("polidromeStr: "+pstr);
		}
		
		
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("ajay");
		arrlist.add("car");
		arrlist.add("banana");
		arrlist.add("racecar");
		arrlist.add("madam");
		
		
		List<String> afterFilter = arrlist.stream().filter(s->pl(s)).collect(Collectors.toList());
		
		System.out.println(afterFilter);

	}
	
	public static boolean chkp(String strNew) {
		int fwd=0;
		int bac=strNew.length()-1;
		while(bac>fwd) {
			if(strNew.charAt(bac--)!=strNew.charAt(fwd++)) {
			return false;	
			}
			
		}
		return true;
	}
	
	
	public static boolean pl(String str) {
		String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
		int forward =0;
		int backword=cleanStr.length()-1;
		
		while(backword>forward) {
		//System.out.println("forward: "+forward++ +" backword: "+backword--);	
		//System.out.println(cleanStr.charAt(forward++));
		//System.out.println(cleanStr.charAt(backword--));
		char forwardChar = cleanStr.charAt(forward++);
		char backwordChar = cleanStr.charAt(backword--);
		
		if(forwardChar!=backwordChar)
			return false;
		
		}
		
		//System.out.println(cleanStr.charAt(forward));
		//System.out.println(cleanStr.charAt(backword));
		
		
		
		
		return true;
	}
	
	
	
	
	public boolean checkPalindrom(String str) {
		int farwardIndex = 0;
		int backwardIndex = str.length()-1;
		
		while(backwardIndex>farwardIndex) {
			if(str.charAt(backwardIndex--) != str.charAt(farwardIndex++)) {
				return false;
			}
			
		}
		
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean isPalindrome(String text) {
	    String clean = text.replaceAll("\\s+", "").toLowerCase();
	    int length = clean.length();
	    int forward = 0;
	    int backward = length - 1;
	    while (backward > forward) {
	        char forwardChar = clean.charAt(forward++);
	        char backwardChar = clean.charAt(backward--);
	        if (forwardChar != backwardChar)
	            return false;
	    }
	    return true;
	}

}
