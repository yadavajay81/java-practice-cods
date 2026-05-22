package programming.defaultmethod;


interface Left1{
	default void m1() {
		System.out.println("Left D M");
	}
}

interface Right1{
	default void m1() {
		System.out.println("Right D F");
	}
}


public class DefaultMethod3 implements Right1, Left1{
	
	
	public void m1() {
		Left1.super.m1();
		Right1.super.m1();
	}
	
	public static void main(String[] args) {
		
		DefaultMethod3 dm = new DefaultMethod3();
		dm.m1();
		
	}

}
