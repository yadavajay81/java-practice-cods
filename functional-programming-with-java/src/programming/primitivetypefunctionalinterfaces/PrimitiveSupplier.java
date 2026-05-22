package programming.primitivetypefunctionalinterfaces;

import java.util.function.IntSupplier;

public class PrimitiveSupplier {

	public static void main(String[] args) {
		IntSupplier s = ()->(int)(Math.random()*10);
		System.out.println(s.getAsInt());

		/**
		 * Get 6 digit OTP
		 */
		String otp="";
		for(int i=0; i<6; i++) {
			otp=otp+s.getAsInt();
		}
		System.out.println("Otp is: "+otp);


	}

}
