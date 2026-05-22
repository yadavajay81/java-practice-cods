package programming.defaultmethod;


interface dinf1{
	default void m1() {
		System.out.println("Default method Print from interface");
	}
}


public class DefaultMethod1 implements dinf1 {
	
	@Override
	public void m1() {
		System.out.println("Default method Print from overwrite");
	}
	
	
	
	
	public static void main(String[] args) {
		DefaultMethod1 dm = new DefaultMethod1();
		
		dm.m1();
		
	}

}
