package hackerrank;

import java.util.stream.IntStream;

public class BinaryArrayToDecimal {

	public static void main(String[] args) {
		int[] binaryArray = {1, 0, 1, 1};
		int decimalsum = 0;
		
		for(int i: binaryArray) {
			decimalsum = decimalsum * 2 + i;
		}
		
		System.out.println(decimalsum);
		
		//with java 8
		
		int sumwithstream = IntStream.of(binaryArray).reduce(0, (deci, sum) -> deci * 2 +sum);
		System.out.println(sumwithstream);

	}

}
