package java17;

import java.util.SplittableRandom;

public class CreateOtp {

	public static void main(String[] args) {
		int otpNum = (int) ((Math.random()*9999)+1000);
		String otp = String.valueOf(otpNum);
		System.out.println("Using Math Random: "+otp);
		
		
		System.out.println("Using SplittableRandom: "+generateOtp(4));
		
		
		String phnum = "32543532456547540920";
		String nphnum = phnum.replaceAll(".(?=.{2})", "#");
		System.out.println(nphnum);

	}
	
	//use SplittableRandom
	
	public static String generateOtp(int otpLength) {
		SplittableRandom splittableRandom = new SplittableRandom();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<otpLength; i++) {
			sb.append(splittableRandom.nextInt(0, 10));
			
		}
		
		return sb.toString();
	}

}
