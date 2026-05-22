package java8certification;

public class ReverseString {

	public static void main(String[] args) {
		int num = 64;
		int powOfNum = 2;
		
		System.out.println(String.format("Number %d is power of %d : %b ", num, powOfNum, powOfNum(num, powOfNum)));
		
		
		
		int n = 27;
		
		
		 
		
		
		System.out.println((n & (n-1)));
		
		String str = "Glider.ai";
		
		System.out.println("String length: "+str.length());
		System.out.println("String charAt: "+str.charAt(str.length()-1));
		
		System.out.println("SubSTR: "+str.substring(0,9));
		
		
		
		System.out.println("Original String: "+str);
		
		
		
		String restr = reverseStr(str);
		System.out.println(restr);
		
		String revstr1 = new StringBuilder(str).reverse().toString();
		System.out.println(revstr1);
		
		
		System.out.println(str.charAt(str.length() - 1));
		System.out.println(str.substring(0, str.length() - 1));
		
		
		
		
		System.out.println("New method: "+ reverse(str));
		
		
		String reverseWithStringBuilder = new StringBuilder(str).reverse().toString();
		System.out.println(reverseWithStringBuilder);
		
		int left = 0;
		int right = str.length()-1;
		String reverseString = "";
		
		while(left<=str.length()-1) {
			
			reverseString = reverseString+str.charAt(right);
					
			left++;
			right--;
		}
		
		System.out.println("Print reverseString: "+reverseString);
		
		
		
		
		str.substring(0, str.length() - 1);
		System.out.println("Original String after substr: "+str);
		
		
		

	}
	
	
	public static boolean powOfNum(int num, int pOfNum) {
		
		if((num <= 0) || (pOfNum <= 0)) {
			return false;
		}
		
		while(num % pOfNum == 0) {
			System.out.println(num);
			num /= pOfNum;
			System.out.println(num);
		}
		System.out.println(num);
		return num == 1;
	}
	

	private static String reverseStr(String input) {
		int left = 0;
		int right = input.length()-1;
		
		String revstr = "";
		
		while(left <=input.length()-1) {
			
			
			revstr=revstr+input.charAt(right);
			
			
			left++;
			right--;
			
		}

		
		return revstr;
	}
	
	
	
	public static String reverse(String str) {
        if (str.isEmpty()) { // Base case for recursion
            return str; 
        }
        
        System.out.println("str in reverse: "+str);
        
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
	
	
	public String reverseBySubstr(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		
		return str.charAt(str.length()-1)+reverseBySubstr(str.substring(0, str.length()-1));
		
	}

}
