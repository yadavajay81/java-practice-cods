package programming.primitivetypefunctionalinterfaces.autounboxing;

/**
 * convert object type to primitive type that is autounboxing
 * 
 * @author yadav
 *
 */
public class Autounboxing1 {

	public static void main(String[] args) {
		
		/**
		 * define object type or wrapper type
		 */
		Integer I = new Integer(10);
		
		/**
		 * convert in primitive type
		 * after compilation it will be
		 * int x= I.intValue()
		 */
		int x = I;
		System.out.println(x);

	}

}
