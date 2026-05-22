package javatest;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		String[] stringArrayWithInvalidNum = new String[] { "pants", "2", "hello", "4", "world", "6", "42" };
		for(String str:stringArrayWithInvalidNum) {
		try {
			int myInt = Integer.parseInt(str);
			System.out.println(myInt);
			
		}catch(NumberFormatException nfe) {
		System.out.println(nfe);	
		}
		}

	}

}
