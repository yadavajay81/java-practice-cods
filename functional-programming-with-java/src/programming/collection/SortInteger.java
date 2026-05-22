package programming.collection;

import java.util.function.Predicate;

public class SortInteger {

	public static void main(String[] args) {

		int[] l = {10, 20, 2, 4,30,50,3,5,7,17};
		
		Predicate<Integer> p1 = i->i>10;
		Predicate<Integer> p2 = i->i%2==0;
		
		
		
		System.out.println("Even Numbers: ");
		m1(p2,l);
		System.out.println("Odd Numbers: ");
		m1(p2.negate(),l);
		
		System.out.println("Numbers Gretor than 10 : ");
		m1(p1,l);
		System.out.println("Numbers not Gretor than 10 : ");
		m1(p1.negate(),l);
		
		
		System.out.println("Even Numbers Gretor than 10 : ");
		m1(p1.and(p2),l);
		
		System.out.println("Odd Numbers not Gretor than 10 : ");
		m1(p1.negate().and(p2.negate()),l);
		
		System.out.println("Even Numbers or Gretor than 10 : ");
		m1(p1.or(p2),l);
		

	}
	
	
	public static void m1(Predicate<Integer> p, int[] i) {
		for(int k:i) {
			if(p.test(k)) {
				System.out.print(k+", ");
				
			}
		}
		System.out.println();
		
	}

}
