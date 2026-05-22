package java8certification;

import java.util.Random;

public class UseRandom {

	public static void main(String[] args) {

		Random random = new Random();
		int randumNumber = random.nextInt(3);
		System.out.printf("Random Number %s", randumNumber);
		System.out.println();
		
		int mathRandom = (int) (Math.random() * 2);
		System.out.printf("Math Random Number %s", mathRandom);

	}

}
