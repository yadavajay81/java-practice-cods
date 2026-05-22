package programming.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class ReadFromCmd {

	public static void main(String[] args) {
		m1();

	}
	
	public static void m1() {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int num = reader.nextInt();
			
			Predicate<Integer> p = i->i%2==0;
			
			if(p.test(num)) {
				System.out.println(num+" is Even");
				m1();
			}else {
				System.out.println(num+" is Odd");
				m1();
			}
		}
	}

}
