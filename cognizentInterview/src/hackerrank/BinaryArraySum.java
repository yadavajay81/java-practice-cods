package hackerrank;

import java.util.stream.IntStream;

public class BinaryArraySum {

	public static void main(String[] args) {
		int[] binaryArray = {1, 0, 1, 1};
		int sum = 0;
		
		for(int i:binaryArray) {
			//sum = sum + i;
			sum += i;
		}
		
		System.out.println(sum);
		
		int sumwithStream = IntStream.of(binaryArray).sum();
		
		System.out.println(sumwithStream);

	}

}
