package programming.testinterview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewTest1 {

	public static void main(String[] args) {
		
		//Print pattern
		int row = 6;
		for(int i=0; i<row; i++) {
			for(int j=row-i; j>1; j--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//find a number is even or odd without using modulo
		ArrayList<Integer> l= new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(17);
		l.add(0);
		l.add(10);
		List<Integer> leven = l.stream().filter(k->k%2==0).collect(Collectors.toList());
		System.out.println("Even number "+leven);
		List<Integer> lodd = l.stream().filter(k->k%2!=0).collect(Collectors.toList());
		System.out.println("Odd number "+lodd);
		
		for(int n:l) {
			//System.out.println("quietent "+n/2);
			
			if(((n/2)*2)==n) {
				System.out.println(n+" is even");
			}else {
				System.out.println(n+" is odd");
			}
			
			
			//using bit operator
			if((n & 1)==0) {
				System.out.println(n+" is even");
			}else {
				System.out.println(n+" is odd");
			}
			
		}

	}

}
