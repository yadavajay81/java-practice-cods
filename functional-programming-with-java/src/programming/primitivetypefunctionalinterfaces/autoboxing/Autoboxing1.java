package programming.primitivetypefunctionalinterfaces.autoboxing;

/**
 * convert primitive type to object type autoboxing
 * compiler are responsible from java 1.5 version its valid
 * 
 * @author yadav
 *
 */
public class Autoboxing1 {

	public static void main(String[] args) {
		/**
		 * x is primitive type
		 */
		int x=10;
		
		/**
		 * x is converting in object type or wrapper type
		 */
		Integer I=x;
		
		/**
		 * after compilation it become 
		 * Integer I = Integer.valueOf(x);
		 */
		System.out.println(I);
		
		
		

	}

}
