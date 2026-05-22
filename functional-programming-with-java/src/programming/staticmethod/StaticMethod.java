package programming.staticmethod;


interface infs{
	public static void m1() {
		System.out.println("Print Static method");
	}
}


public class StaticMethod implements infs {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//m1();   //not work
		//StaticMethod.m1();   //not work
		StaticMethod sm = new StaticMethod();
		//sm.m1();   //not work
		infs.m1();   //only this work
	}

}
