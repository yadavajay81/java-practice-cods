package programming.consumer;

import java.util.function.BiConsumer;

/**
 * when need to Input two input value
 * then use biconsumer
 * @author yadav
 *
 */
public class BiConsumerTest {

	public static void main(String[] args) {
		
		
		con("Ajay", "Yadav");
		con("Mamta", "Yadav");
		con("Srishti", "Yadav");
		con("Shreya", "Yadav");
		con("Shreyas", "Yadav");

	}
	
	
	public static void con(String str1, String str2) {
		BiConsumer<String, String> c	=	(s1,s2)->System.out.println(s1+" "+s2);
		
		c.accept(str1, str2);
	}

}
