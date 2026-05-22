package programming.methodrefrenceandconstructorrefrencedoubblecolon;

/**
 * Implementation of interface using lambda expression
 * @author yadav
 *
 */
public class TestClass {

	public static void main(String[] args) {
		Intrefacetest i = (s1, s2)->{
			
			String s3 = s1+" "+s2;
			System.out.println(s3);
		};
		
		i.m1("Ajay","Yadav");

	}

}
