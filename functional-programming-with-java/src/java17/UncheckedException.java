package java17;

import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		
		int c = a/b;
		System.out.println("Division of given number is: "+c);

	}

}
