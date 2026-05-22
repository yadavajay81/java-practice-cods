package programming.interfaces;

public class SquareTest {

	public static void main(String[] args) {
		SquareInterface si = a->a*a;
		
		System.out.println(si.squareit(4));
		System.out.println(si.squareit(12));

	}

}
