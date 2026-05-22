package java8certification;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestSubString {

	public static void main(String[] args) {
		String mainStr = "Implement a function to find the longest substring without repeating characters.";
		String[] strArrs = mainStr.split("\\s+");
		
		
		
		String longSubStr = "";
		String longSubStrWithoutRepeatChar = "";
		int longSubStrWithoutRepeatCharInt=0;
		HashSet<Character> strWithOutRepeat = new HashSet<>();
		for(String strArr: strArrs) {
			
			for(int i=0; i<strArr.length();i++) {
				strWithOutRepeat.add(strArr.charAt(i));
				
			}
			System.out.println("strWithOutRepeat: "+strWithOutRepeat+ " Size: "+strWithOutRepeat.size());
			//with repeated
			if(strArr.length()>longSubStr.length()) {
				longSubStr = strArr;
			}
			
			//without repeated
			if(strWithOutRepeat.size()>longSubStrWithoutRepeatCharInt) {
				longSubStrWithoutRepeatCharInt = strWithOutRepeat.size();
				longSubStrWithoutRepeatChar = strArr;
			}
			strWithOutRepeat.clear();
			
		}
		System.out.println("Longest Sub String: "+longSubStr);
		System.out.println("Longest Sub String longSubStrWithoutRepeatChar: "+longSubStrWithoutRepeatChar);

	}

}
