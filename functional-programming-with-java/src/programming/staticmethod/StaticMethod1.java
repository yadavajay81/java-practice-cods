package programming.staticmethod;


interface inrfs1{
	public static void m1() {
	System.out.println("From interface");
	}
}

public class StaticMethod1 implements inrfs1 {
	
	public static void m1() {
		System.out.println("From class");
		}
	
	public static void main(String[] args) {
		StaticMethod1.m1();
		inrfs1.m1();
		
	}
	
}
