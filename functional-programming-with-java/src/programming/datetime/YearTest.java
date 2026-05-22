package programming.datetime;


import java.time.Year;
import java.util.Scanner;

public class YearTest {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Year:");
			int n = sc.nextInt();
			
			Year y = Year.of(n);
			
			if(y.isLeap()) {
				System.out.printf("%d is leap year.",n);
			}else {
				System.out.printf("%d is not leap year.",n);
			}
		}
		
		

	}

}
