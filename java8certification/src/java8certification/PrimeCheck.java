package java8certification;

public class PrimeCheck {
	public static void main(String[] args) {
		int input = 15;
		
		System.out.println(input+ " is prime? "+checkPrime(input));
	}

	private static boolean checkPrime(int input) {
		if(input<=1) return false;
		
		for(int i=2; i<Math.sqrt(input);i++) {
			if(input % i == 0) return false;
		}


		return true;
	}

}
