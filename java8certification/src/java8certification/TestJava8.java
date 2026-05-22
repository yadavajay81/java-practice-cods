package java8certification;

import java.util.ArrayList;
import java.util.Arrays;

public class TestJava8 {

	public static void main(String[] args) {
		int[] numbers = {5,4,8,2,9,3,1,3,8,4,5,9};
		
		ArrayList<Integer> number1 = new ArrayList<Integer>();
		int x =0;
		for(int i=0; i<numbers.length; i++) {
			if(!number1.contains(numbers[i])) {
				number1.add(numbers[i]);
			}
			
		}
		
		System.out.println(number1.toString());
		
		System.out.println(numbers.length);
		System.out.println(numbers[11]);
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		System.out.println(numbers[numbers.length - 2]);

	}

}
