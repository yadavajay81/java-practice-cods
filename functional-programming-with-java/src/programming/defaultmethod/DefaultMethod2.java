package programming.defaultmethod;

interface Left{
	default void m1() {
		System.out.println("Left D M");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right D M");
	}
}

public class DefaultMethod2 implements Left, Right {
	
	public void m1() {
		System.out.println("Own implementation");
	}
	
	public static void main(String[] args) {
		DefaultMethod2 dm = new DefaultMethod2();
		dm.m1();
		
		
	}

}
