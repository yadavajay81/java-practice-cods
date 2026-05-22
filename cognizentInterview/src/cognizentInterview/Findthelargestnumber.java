package cognizentInterview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Findthelargestnumber {
	static String strinStatic;
	
	static {
		System.out.println("Static block here ===================");
		 strinStatic = "String in Static block";
	}


	public static void main(String[] args) throws IOException {
		System.out.println(strinStatic);
		
		int[] num = {23,5,6,8,90,34,1,3,4,-98,91};
		System.out.println(Arrays.toString(num));
		List<Integer> num1 = Arrays.stream(num).boxed().collect(Collectors.toList());
		System.out.println(num1);
		
		Findthelargestnumber fln = new Findthelargestnumber();
		System.out.println(fln.largestNumber(num));
		
		int a = Arrays.stream(num).max().orElseThrow();
		System.out.println(a);
		
		
		//check palindrome
		String str="Raja Ram";
		
		if(fln.chkpalindrome(str)) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("Not Palindrome");
		}
		
		
		String[] strArr = {"ajay","car","banana","racecar","madam"};
		ArrayList<String> palindromArr = new ArrayList<>();
		for(String x:strArr) {
			if(fln.chkpalindrome(x)) {
				palindromArr.add(x);
				
			}
			
		}
		
		System.out.println(palindromArr.toString());
		
		
		//reverse a string
		String strn = "reverse a string";
		
		System.out.println(new StringBuilder(strn).reverse().toString());
		
		
		Path path = Path.of("books.text");
		Files.writeString(path, "Add new String");
		
		String content= Files.readString(path);
		
		System.out.println("=============================================");
		System.out.println(content);
		System.out.println("=============================================");
		
		

	}
	
	public int largestNumber(int[] num) {
		int largestnumber=0;
		for(int i:num) {
			if(largestnumber<i) {
				largestnumber=i;
			}
		}
		
		
		return largestnumber;
	}
	
	
	public boolean chkpalindrome(String str) {
		boolean palindrom=true;
		int start = 0;
		int end = str.length()-1;
		
		
		while(end>start) {
			if(str.charAt(end)!=str.charAt(start)) {
				return false;
			}
			
			end--;
			start++;
		}
		
		
		return palindrom;
		
	}
	
	
}
