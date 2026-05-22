package programming.supplier;

import java.util.function.Supplier;

/**
 * get 6 digit otp using supplier
 * @author yadav
 *
 */
public class SupRandOtp {

	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String otp = "";
			
			for(int i=0; i<6; i++) {
				otp = otp+(int) (Math.random()*10); //random number from 0-9
			}
			return otp;
		};
		
		System.out.println("Six digit OTP: "+s.get());
		System.out.println("Six digit OTP: "+s.get());
		System.out.println("Six digit OTP: "+s.get());
		System.out.println("Six digit OTP: "+s.get());
		System.out.println("Six digit OTP: "+s.get());
		System.out.println("Six digit OTP: "+s.get());
		System.out.println("Six digit OTP: "+s.get());

	}

}
