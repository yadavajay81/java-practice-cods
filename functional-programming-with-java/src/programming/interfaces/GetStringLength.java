package programming.interfaces;

public class GetStringLength {

	public static void main(String[] args) {
		
		StringLength strl = s->s.length();
		
		System.out.println(strl.getLength("hello"));
		System.out.println(strl.getLength("hello Ram"));

	}

}
