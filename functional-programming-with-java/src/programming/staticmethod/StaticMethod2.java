package programming.staticmethod;


interface inrfs2{
	public static void m1() {
		System.out.println("Print interface method");
	}
	public static void m2() {
		System.out.println("Print interface method m2");
	}
}

public class StaticMethod2 {
	
	public void m1() {
		System.out.println("Print from class");
	}
	
	private static void m2() {
		System.out.println("Print class method m2");
	}
	
	public static void main(String args[]) {
		StaticMethod2 sm = new StaticMethod2();
		sm.m1();
		inrfs2.m1();
		StaticMethod2.m2();
		inrfs2.m2();
		
	}

}
