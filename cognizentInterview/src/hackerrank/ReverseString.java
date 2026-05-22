package hackerrank;

public class ReverseString {

	public static void main(String[] args) {
		String str = "ajay";
		char[] ch = str.toCharArray();
		StringBuilder output = new StringBuilder();
		
		for(int i = ch.length - 1; i>=0; i--) {
			output = output.append(ch[i]);
		}
		
		System.out.println(output.toString());

	}

}
