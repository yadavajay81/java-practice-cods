package programming.defaultmethod;

interface dinf{
	default void m1() {
		System.out.println("Default method");
	}
}



public class DefaultMethod implements dinf{

	public static void main(String[] args) {
		DefaultMethod df = new DefaultMethod();
		
		df.m1();

	}

}
